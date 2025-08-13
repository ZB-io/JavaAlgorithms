package com.thealgorithms.ciphers.a5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions.assertThat;
import java.util.BitSet;
import org.junit.jupiter.api;
import org.junit.jupiter.api.Assertions;

public class A5KeyStreamGeneratorTest {

	/*
	 * ROOST_METHOD_HASH=reInitialize_26ce34e87a
	 * ROOST_METHOD_SIG_HASH=reInitialize_050dd16102
	 *
	 */void setUp() {
		keyStreamGenerator = new A5KeyStreamGenerator();
		sessionKey = new BitSet(64);
		frameCounter = new BitSet(22);

		sessionKey.set(0, true);
		sessionKey.set(63, true);
		frameCounter.set(0, true);
		frameCounter.set(21, true);
	}

	/*
	 * ROOST_METHOD_HASH=reInitialize_26ce34e87a
	 * ROOST_METHOD_SIG_HASH=reInitialize_050dd16102
	 *
	 */void reinitializeWithValidParameters() {

		keyStreamGenerator.initialize(sessionKey, frameCounter);
		BitSet firstKeyStream = keyStreamGenerator.getNextKeyStream();

		keyStreamGenerator.reInitialize();
		BitSet secondKeyStream = keyStreamGenerator.getNextKeyStream();

		assertThat(secondKeyStream).isEqualTo(firstKeyStream);
	}

	/*
	 * ROOST_METHOD_HASH=reInitialize_26ce34e87a
	 * ROOST_METHOD_SIG_HASH=reInitialize_050dd16102
	 *
	 */void reinitializeAfterMultipleKeyStreams() {

		keyStreamGenerator.initialize(sessionKey, frameCounter);
		BitSet firstKeyStream = keyStreamGenerator.getNextKeyStream();

		keyStreamGenerator.getNextKeyStream();

		keyStreamGenerator.reInitialize();
		BitSet afterReinitKeyStream = keyStreamGenerator.getNextKeyStream();

		assertThat(afterReinitKeyStream).isEqualTo(firstKeyStream);
	}

	/*
	 * ROOST_METHOD_HASH=reInitialize_26ce34e87a
	 * ROOST_METHOD_SIG_HASH=reInitialize_050dd16102
	 *
	 */void reinitializePreservesInitialState() {

		keyStreamGenerator.initialize(sessionKey, frameCounter);

		keyStreamGenerator.reInitialize();

		BitSet firstStream = keyStreamGenerator.getNextKeyStream();
		keyStreamGenerator.reInitialize();
		BitSet secondStream = keyStreamGenerator.getNextKeyStream();
		assertThat(secondStream).isEqualTo(firstStream);
	}

	/*
	 * ROOST_METHOD_HASH=getNextKeyStream_5c2760cf56
	 * ROOST_METHOD_SIG_HASH=getNextKeyStream_977f343e83
	 *
	 */void setUp() {
		keyStreamGenerator = new A5KeyStreamGenerator();
	}

	/*
	 * ROOST_METHOD_HASH=getNextKeyStream_5c2760cf56
	 * ROOST_METHOD_SIG_HASH=getNextKeyStream_977f343e83
	 *
	 */void keyStreamGenerationWithValidInitialization() {

		BitSet sessionKey = new BitSet(SESSION_KEY_LENGTH);

		sessionKey.set(0, true);
		sessionKey.set(5, true);
		sessionKey.set(10, true);
		BitSet frameCounter = new BitSet(FRAME_COUNTER_LENGTH);

		frameCounter.set(0, true);
		frameCounter.set(3, true);
		keyStreamGenerator.initialize(sessionKey, frameCounter);

		BitSet keyStream = keyStreamGenerator.getNextKeyStream();

		assertNotNull(keyStream, "Generated key stream should not be null");
		assertEquals(KEY_STREAM_LENGTH, keyStream.length(), "Key stream length should match expected length");
	}

	/*
	 * ROOST_METHOD_HASH=getNextKeyStream_5c2760cf56
	 * ROOST_METHOD_SIG_HASH=getNextKeyStream_977f343e83
	 *
	 */void keyStreamGenerationWithEmptyInitialization() {

		BitSet sessionKey = new BitSet(SESSION_KEY_LENGTH);
		BitSet frameCounter = new BitSet(FRAME_COUNTER_LENGTH);
		keyStreamGenerator.initialize(sessionKey, frameCounter);

		BitSet keyStream = keyStreamGenerator.getNextKeyStream();

		assertNotNull(keyStream, "Generated key stream should not be null");
		assertEquals(KEY_STREAM_LENGTH, keyStream.length(),
				"Key stream length should match expected length even with empty initialization");
	}

	/*
	 * ROOST_METHOD_HASH=getNextKeyStream_5c2760cf56
	 * ROOST_METHOD_SIG_HASH=getNextKeyStream_977f343e83
	 *
	 */void consecutiveKeyStreamGeneration() {

		BitSet sessionKey = new BitSet(SESSION_KEY_LENGTH);
		sessionKey.set(0, true);
		BitSet frameCounter = new BitSet(FRAME_COUNTER_LENGTH);
		frameCounter.set(0, true);
		keyStreamGenerator.initialize(sessionKey, frameCounter);

		BitSet firstKeyStream = keyStreamGenerator.getNextKeyStream();
		BitSet secondKeyStream = keyStreamGenerator.getNextKeyStream();

		assertNotNull(firstKeyStream, "First key stream should not be null");
		assertNotNull(secondKeyStream, "Second key stream should not be null");
		assertNotEquals(firstKeyStream, secondKeyStream, "Consecutive key streams should be different");
	}

}