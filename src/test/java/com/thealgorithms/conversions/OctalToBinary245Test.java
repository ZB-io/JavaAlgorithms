package com.thealgorithms.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;

public class OctalToBinary245Test {

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertZeroOctalDigit() {
		assertEquals(0, OctalToBinary.convertOctalDigitToBinary(0));
	}

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertMaximumOctalDigit() {
		assertEquals(111, OctalToBinary.convertOctalDigitToBinary(7));
	}

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertMiddleRangeOctalDigit() {
		assertEquals(100, OctalToBinary.convertOctalDigitToBinary(4));
	}

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertInvalidOctalDigit() {
		assertEquals(1000, OctalToBinary.convertOctalDigitToBinary(8));
	}

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertSmallOctalDigit() {
		assertEquals(1, OctalToBinary.convertOctalDigitToBinary(1));
	}

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertNegativeOctalDigit() {
		assertEquals(11, OctalToBinary.convertOctalDigitToBinary(-3));
	}

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertOctalDigitTwo() {
		assertEquals(10, OctalToBinary.convertOctalDigitToBinary(2));
	}

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertOctalDigitThree() {
		assertEquals(11, OctalToBinary.convertOctalDigitToBinary(3));
	}

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertOctalDigitFive() {
		assertEquals(101, OctalToBinary.convertOctalDigitToBinary(5));
	}

	/*
	 * ROOST_METHOD_HASH=convertOctalDigitToBinary_a89c6a9c9b
	 * ROOST_METHOD_SIG_HASH=convertOctalDigitToBinary_371bc8fc01
	 *
	 */void convertOctalDigitSix() {
		assertEquals(110, OctalToBinary.convertOctalDigitToBinary(6));
	}

}