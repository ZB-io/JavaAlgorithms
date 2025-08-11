package com.thealgorithms.ciphers.a5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.BitSet;
import org.junit.jupiter.api;

public class A5CipherTest {

	/*
	 * ROOST_METHOD_HASH=resetCounter_b7ea9a52af
	 * ROOST_METHOD_SIG_HASH=resetCounter_28473d5786
	 *
	 */void setUp() {
		sessionKey = new BitSet(64);

		sessionKey.set(0, 64);
		frameCounter = new BitSet(22);

		frameCounter.set(0, 22);
		cipher = new A5Cipher(sessionKey, frameCounter);
	}

	/*
	 * ROOST_METHOD_HASH=resetCounter_b7ea9a52af
	 * ROOST_METHOD_SIG_HASH=resetCounter_28473d5786
	 *
	 */void basicCounterReset() {

		BitSet plainText = new BitSet(228);

		plainText.set(0, 228);

		BitSet firstEncryption = cipher.encrypt(plainText);

		cipher.resetCounter();

		BitSet secondEncryption = cipher.encrypt(plainText);

		assertEquals(firstEncryption, secondEncryption, "Encryption results should be identical after counter reset");
	}

	/*
	 * ROOST_METHOD_HASH=resetCounter_b7ea9a52af
	 * ROOST_METHOD_SIG_HASH=resetCounter_28473d5786
	 *
	 */void multipleResets() {
		BitSet plainText = new BitSet(228);
		plainText.set(0, 228);
		BitSet firstEncryption = cipher.encrypt(plainText);

		cipher.resetCounter();
		cipher.resetCounter();
		cipher.resetCounter();
		BitSet finalEncryption = cipher.encrypt(plainText);
		assertEquals(firstEncryption, finalEncryption, "Encryption should be identical after multiple resets");
	}

	/*
	 * ROOST_METHOD_HASH=resetCounter_b7ea9a52af
	 * ROOST_METHOD_SIG_HASH=resetCounter_28473d5786
	 *
	 */void resetBetweenDifferentInputs() {
		BitSet firstInput = new BitSet(228);

		firstInput.set(0, 114);
		BitSet secondInput = new BitSet(228);

		secondInput.set(114, 228);
		BitSet firstEncryption = cipher.encrypt(firstInput);
		cipher.resetCounter();
		BitSet secondEncryption = cipher.encrypt(secondInput);
		assertNotEquals(firstEncryption, secondEncryption,
				"Different inputs should produce different encryptions even after reset");
	}

}