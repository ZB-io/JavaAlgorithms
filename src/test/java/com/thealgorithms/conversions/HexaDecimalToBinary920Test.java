package com.thealgorithms.conversions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;

public class HexaDecimalToBinary920Test {

	/*
	 * ROOST_METHOD_HASH=completeDigits_a69863a428
	 * ROOST_METHOD_SIG_HASH=completeDigits_7a23f6ce8a
	 *
	 */void setUp() {
		converter = new HexaDecimalToBinary();
	}

	/*
	 * ROOST_METHOD_HASH=completeDigits_a69863a428
	 * ROOST_METHOD_SIG_HASH=completeDigits_7a23f6ce8a
	 *
	 */void binaryStringPaddingWithLeadingZeros() {
		String result = converter.completeDigits("1010");
		assertEquals("00001010", result);
	}

	/*
	 * ROOST_METHOD_HASH=completeDigits_a69863a428
	 * ROOST_METHOD_SIG_HASH=completeDigits_7a23f6ce8a
	 *
	 */void emptyStringInput() {
		String result = converter.completeDigits("");
		assertEquals("00000000", result);
	}

	/*
	 * ROOST_METHOD_HASH=completeDigits_a69863a428
	 * ROOST_METHOD_SIG_HASH=completeDigits_7a23f6ce8a
	 *
	 */void eightBitBinaryString() {
		String result = converter.completeDigits("11111111");
		assertEquals("11111111", result);
	}

	/*
	 * ROOST_METHOD_HASH=completeDigits_a69863a428
	 * ROOST_METHOD_SIG_HASH=completeDigits_7a23f6ce8a
	 *
	 */void singleBitBinaryString() {
		String result = converter.completeDigits("1");
		assertEquals("00000001", result);
	}

	/*
	 * ROOST_METHOD_HASH=completeDigits_a69863a428
	 * ROOST_METHOD_SIG_HASH=completeDigits_7a23f6ce8a
	 *
	 */void fourBitBinaryString() {
		String result = converter.completeDigits("1111");
		assertEquals("00001111", result);
	}

	/*
	 * ROOST_METHOD_HASH=completeDigits_a69863a428
	 * ROOST_METHOD_SIG_HASH=completeDigits_7a23f6ce8a
	 *
	 */void sevenBitBinaryString() {
		String result = converter.completeDigits("1111111");
		assertEquals("01111111", result);
	}

}