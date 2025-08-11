package com.thealgorithms.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;
import org.junit.jupiter.api.DisplayName;

public class AnyBaseToDecimalTest {

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void convertBinaryToDecimal() {
		assertEquals(10, AnyBaseToDecimal.convertToDecimal("1010", 2));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void convertOctalToDecimal() {
		assertEquals(511, AnyBaseToDecimal.convertToDecimal("777", 8));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void convertDecimalToDecimal() {
		assertEquals(999, AnyBaseToDecimal.convertToDecimal("999", 10));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void convertHexadecimalToDecimal() {
		assertEquals(11259375, AnyBaseToDecimal.convertToDecimal("ABCDEF", 16));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void convertBase36ToDecimal() {
		assertEquals(44027, AnyBaseToDecimal.convertToDecimal("XYZ", 36));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void invalidCharacterException() {
		NumberFormatException exception = assertThrows(NumberFormatException.class,
				() -> AnyBaseToDecimal.convertToDecimal("abc", 16));
		assertTrue(exception.getMessage().contains("invalid character"));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void digitExceedingRadixException() {
		NumberFormatException exception = assertThrows(NumberFormatException.class,
				() -> AnyBaseToDecimal.convertToDecimal("9", 8));
		assertTrue(exception.getMessage().contains("For input string"));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void emptyStringInput() {
		NumberFormatException exception = assertThrows(NumberFormatException.class,
				() -> AnyBaseToDecimal.convertToDecimal("", 16));
		assertTrue(exception.getMessage().contains("For input string"));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void singleDigitInput() {
		assertEquals(5, AnyBaseToDecimal.convertToDecimal("5", 10));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void invalidRadixInput() {
		assertThrows(NumberFormatException.class, () -> AnyBaseToDecimal.convertToDecimal("123", 37));
	}

	/*
	 * ROOST_METHOD_HASH=convertToDecimal_9be566d7bc
	 * ROOST_METHOD_SIG_HASH=convertToDecimal_9ea87e4377
	 *
	 */void maxValidRadixInput() {
		assertEquals(35, AnyBaseToDecimal.convertToDecimal("Z", 36));
	}

	/*
	 * ROOST_METHOD_HASH=valOfChar_49025d5898 ROOST_METHOD_SIG_HASH=valOfChar_1485114702
	 *
	 */void validNumericCharacterConversion() {
		assertEquals(7, AnyBaseToDecimal.valOfChar('7'));
	}

	/*
	 * ROOST_METHOD_HASH=valOfChar_49025d5898 ROOST_METHOD_SIG_HASH=valOfChar_1485114702
	 *
	 */void validUppercaseLetterConversion() {
		assertEquals(10, AnyBaseToDecimal.valOfChar('A'));
		assertEquals(15, AnyBaseToDecimal.valOfChar('F'));
		assertEquals(25, AnyBaseToDecimal.valOfChar('P'));
	}

	/*
	 * ROOST_METHOD_HASH=valOfChar_49025d5898 ROOST_METHOD_SIG_HASH=valOfChar_1485114702
	 *
	 */void boundaryNumericValues() {
		assertEquals(0, AnyBaseToDecimal.valOfChar('0'));
		assertEquals(9, AnyBaseToDecimal.valOfChar('9'));
	}

	/*
	 * ROOST_METHOD_HASH=valOfChar_49025d5898 ROOST_METHOD_SIG_HASH=valOfChar_1485114702
	 *
	 */void boundaryLetterValues() {
		assertEquals(10, AnyBaseToDecimal.valOfChar('A'));
		assertEquals(35, AnyBaseToDecimal.valOfChar('Z'));
	}

	/*
	 * ROOST_METHOD_HASH=valOfChar_49025d5898 ROOST_METHOD_SIG_HASH=valOfChar_1485114702
	 *
	 */void invalidLowercaseInput() {
		assertThrows(NumberFormatException.class, () -> {
			AnyBaseToDecimal.valOfChar('a');
		});
	}

	/*
	 * ROOST_METHOD_HASH=valOfChar_49025d5898 ROOST_METHOD_SIG_HASH=valOfChar_1485114702
	 *
	 */void invalidSpecialCharacterInput() {
		assertThrows(NumberFormatException.class, () -> {
			AnyBaseToDecimal.valOfChar('#');
		});
	}

	/*
	 * ROOST_METHOD_HASH=valOfChar_49025d5898 ROOST_METHOD_SIG_HASH=valOfChar_1485114702
	 *
	 */void invalidSpaceInput() {
		assertThrows(NumberFormatException.class, () -> {
			AnyBaseToDecimal.valOfChar(' ');
		});
	}

}