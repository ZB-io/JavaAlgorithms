package com.thealgorithms.conversions;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DecimalToAnyBaseTest {

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertDecimalToBinary() {
		String result = DecimalToAnyBase.convertToAnyBase(10, 2);
		assertEquals("1010", result);
	}

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertDecimalToHexadecimal() {
		String result = DecimalToAnyBase.convertToAnyBase(255, 16);
		assertEquals("FF", result);
	}

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertDecimalToOctal() {
		String result = DecimalToAnyBase.convertToAnyBase(64, 8);
		assertEquals("100", result);
	}

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertSingleDigitNumber() {
		String result = DecimalToAnyBase.convertToAnyBase(5, 2);
		assertEquals("101", result);
	}

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertLargeDecimalNumber() {
		String result = DecimalToAnyBase.convertToAnyBase(1000000, 16);
		assertEquals("F4240", result);
	}

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertToBaseThirtySix() {
		String result = DecimalToAnyBase.convertToAnyBase(1234, 36);
		assertEquals("YA", result);
	}

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertZero() {
		String result = DecimalToAnyBase.convertToAnyBase(0, 2);
		assertEquals("", result);
	}

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertToBaseTen() {
		String result = DecimalToAnyBase.convertToAnyBase(123, 10);
		assertEquals("123", result);
	}

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertMaxInteger() {
		String result = DecimalToAnyBase.convertToAnyBase(Integer.MAX_VALUE, 16);
		assertEquals("7FFFFFFF", result);
	}

	/*
	 * ROOST_METHOD_HASH=convertToAnyBase_b6262cd97e
	 * ROOST_METHOD_SIG_HASH=convertToAnyBase_2aea0926fe
	 *
	 */void convertToBaseTwo() {
		String result = DecimalToAnyBase.convertToAnyBase(15, 2);
		assertEquals("1111", result);
	}

	/*
	 * ROOST_METHOD_HASH=reVal_dd87273957 ROOST_METHOD_SIG_HASH=reVal_e2d4f7ea73
	 *
	 */void singleDigitNumberConversion() {
		assertEquals('5', DecimalToAnyBase.reVal(5));
	}

	/*
	 * ROOST_METHOD_HASH=reVal_dd87273957 ROOST_METHOD_SIG_HASH=reVal_e2d4f7ea73
	 *
	 */void alphabeticCharacterConversion() {
		assertEquals('C', DecimalToAnyBase.reVal(12));
	}

	/*
	 * ROOST_METHOD_HASH=reVal_dd87273957 ROOST_METHOD_SIG_HASH=reVal_e2d4f7ea73
	 *
	 */void zeroValueHandling() {
		assertEquals('0', DecimalToAnyBase.reVal(0));
	}

	/*
	 * ROOST_METHOD_HASH=reVal_dd87273957 ROOST_METHOD_SIG_HASH=reVal_e2d4f7ea73
	 *
	 */void maximumSingleDigitValue() {
		assertEquals('9', DecimalToAnyBase.reVal(9));
	}

	/*
	 * ROOST_METHOD_HASH=reVal_dd87273957 ROOST_METHOD_SIG_HASH=reVal_e2d4f7ea73
	 *
	 */void maximumAlphabeticValue() {
		assertEquals('Z', DecimalToAnyBase.reVal(35));
	}

	/*
	 * ROOST_METHOD_HASH=reVal_dd87273957 ROOST_METHOD_SIG_HASH=reVal_e2d4f7ea73
	 *
	 */void transitionValue() {
		assertEquals('A', DecimalToAnyBase.reVal(10));
	}

	/*
	 * ROOST_METHOD_HASH=reVal_dd87273957 ROOST_METHOD_SIG_HASH=reVal_e2d4f7ea73
	 *
	 */void multipleValidInputs() {
		char[] expected = { '3', '7', 'B', 'F', 'K', 'X' };
		int[] inputs = { 3, 7, 11, 15, 20, 33 };
		for (int i = 0; i < inputs.length; i++) {
			assertEquals(expected[i], DecimalToAnyBase.reVal(inputs[i]));
		}
	}

	/*
	 * ROOST_METHOD_HASH=reVal_dd87273957 ROOST_METHOD_SIG_HASH=reVal_e2d4f7ea73
	 *
	 */void consecutiveTransitionValues() {
		assertEquals('9', DecimalToAnyBase.reVal(9));
		assertEquals('A', DecimalToAnyBase.reVal(10));
		assertEquals('B', DecimalToAnyBase.reVal(11));
	}

}