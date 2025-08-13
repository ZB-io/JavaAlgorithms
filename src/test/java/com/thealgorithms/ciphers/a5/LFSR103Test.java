package com.thealgorithms.ciphers.a5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.BitSet;
import org.junit.jupiter.api;

public class LFSR103Test {

	/*
	 * ROOST_METHOD_HASH=getLastBit_8343d96020 ROOST_METHOD_SIG_HASH=getLastBit_4c9fbbebf8
	 *
	 */void setUp() {
		lfsr = new LFSR(LENGTH, CLOCK_BIT, TAPPING_BITS);
	}

	/*
	 * ROOST_METHOD_HASH=getLastBit_8343d96020 ROOST_METHOD_SIG_HASH=getLastBit_4c9fbbebf8
	 *
	 */void getLastBitFromEmptyRegister() {
		assertFalse(lfsr.getLastBit());
	}

	/*
	 * ROOST_METHOD_HASH=getLastBit_8343d96020 ROOST_METHOD_SIG_HASH=getLastBit_4c9fbbebf8
	 *
	 */void getLastBitAfterInitialization() {
		BitSet sessionKey = new BitSet(64);

		sessionKey.set(63);
		BitSet frameCounter = new BitSet(22);
		lfsr.initialize(sessionKey, frameCounter);
		boolean lastBit = lfsr.getLastBit();
		assertNotNull(lastBit);
	}

	/*
	 * ROOST_METHOD_HASH=getLastBit_8343d96020 ROOST_METHOD_SIG_HASH=getLastBit_4c9fbbebf8
	 *
	 */void getLastBitAfterClocking() {
		BitSet sessionKey = new BitSet(64);
		BitSet frameCounter = new BitSet(22);
		lfsr.initialize(sessionKey, frameCounter);
		boolean initialLastBit = lfsr.getLastBit();
		lfsr.clock();
		boolean newLastBit = lfsr.getLastBit();
		assertNotEquals(initialLastBit, newLastBit);
	}

	/*
	 * ROOST_METHOD_HASH=getLastBit_8343d96020 ROOST_METHOD_SIG_HASH=getLastBit_4c9fbbebf8
	 *
	 */void getLastBitAtRegisterBoundary() {
		LFSR smallLfsr = new LFSR(1, 0, new int[] { 0 });
		assertFalse(smallLfsr.getLastBit());
	}

}