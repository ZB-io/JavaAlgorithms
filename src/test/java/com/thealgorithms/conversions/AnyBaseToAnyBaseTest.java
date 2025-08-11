package com.thealgorithms.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.junit.jupiter.api;

public class AnyBaseToAnyBaseTest {

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void validateBinaryNumber() {
		assertTrue(AnyBaseToAnyBase.validForBase("1010", 2));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void validateDecimalNumber() {
		assertTrue(AnyBaseToAnyBase.validForBase("123", 10));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void validateHexNumber() {
		assertTrue(AnyBaseToAnyBase.validForBase("1A2B", 16));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void invalidBinaryNumber() {
		assertFalse(AnyBaseToAnyBase.validForBase("102", 2));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void invalidHexNumber() {
		assertFalse(AnyBaseToAnyBase.validForBase("1G2H", 16));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void emptyString() {
		assertTrue(AnyBaseToAnyBase.validForBase("", 16));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void singleDigit() {
		assertTrue(AnyBaseToAnyBase.validForBase("5", 10));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void maxBase() {
		assertTrue(AnyBaseToAnyBase.validForBase("XYZ", 36));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void minBase() {
		assertTrue(AnyBaseToAnyBase.validForBase("1", 2));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void lowerCaseLetters() {
		assertFalse(AnyBaseToAnyBase.validForBase("abc", 16));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void specialCharacters() {
		assertFalse(AnyBaseToAnyBase.validForBase("12#$", 10));
	}

	/*
	 * ROOST_METHOD_HASH=validForBase_0b1e598305
	 * ROOST_METHOD_SIG_HASH=validForBase_fe9f421ca2
	 *
	 */void whiteSpace() {
		assertFalse(AnyBaseToAnyBase.validForBase("12 34", 10));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void binaryToDecimalConversion() {
		assertEquals("10", AnyBaseToAnyBase.base2base("1010", 2, 10));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void decimalToHexadecimalConversion() {
		assertEquals("FF", AnyBaseToAnyBase.base2base("255", 10, 16));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void handleZeroInput() {
		assertEquals("0", AnyBaseToAnyBase.base2base("0", 8, 2));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void maximumBaseConversion() {
		assertEquals("35", AnyBaseToAnyBase.base2base("Z", 36, 10));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void minimumBaseConversion() {
		assertEquals("17", AnyBaseToAnyBase.base2base("1111", 2, 8));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void complexBaseConversion() {
		assertEquals("222", AnyBaseToAnyBase.base2base("123", 4, 3));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void singleCharacterConversion() {
		assertEquals("15", AnyBaseToAnyBase.base2base("F", 16, 10));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void hexadecimalToBinaryConversion() {
		assertEquals("10100", AnyBaseToAnyBase.base2base("14", 16, 2));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void octalToHexadecimalConversion() {
		assertEquals("FF", AnyBaseToAnyBase.base2base("377", 8, 16));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void singleDigitConversion() {
		assertEquals("7", AnyBaseToAnyBase.base2base("7", 10, 10));
	}

	/*
	 * ROOST_METHOD_HASH=base2base_d15fddca7b ROOST_METHOD_SIG_HASH=base2base_46f17a37d8
	 *
	 */void validForBaseTest() {
		assertTrue(AnyBaseToAnyBase.validForBase("1234", 10));
		assertTrue(AnyBaseToAnyBase.validForBase("ABCDEF", 16));
		assertFalse(AnyBaseToAnyBase.validForBase("G", 16));
		assertFalse(AnyBaseToAnyBase.validForBase("2", 2));
	}

}