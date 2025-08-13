package com.thealgorithms.conversions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;
import java.util.Scanner;

public class TurkishToLatinConversionTest {

	/*
	 * ROOST_METHOD_HASH=convertTurkishToLatin_793c35417c
	 * ROOST_METHOD_SIG_HASH=convertTurkishToLatin_39fc57c16b
	 *
	 */void basicTurkishCharacterConversion() {
		String input = "ıİüÜöÖşŞçÇğĞ";
		String expected = "iIuUoOsSçCgG";
		String actual = TurkishToLatinConversion.convertTurkishToLatin(input);
		assertEquals(expected, actual);
	}

	/*
	 * ROOST_METHOD_HASH=convertTurkishToLatin_793c35417c
	 * ROOST_METHOD_SIG_HASH=convertTurkishToLatin_39fc57c16b
	 *
	 */void emptyStringInput() {
		String input = "";
		String actual = TurkishToLatinConversion.convertTurkishToLatin(input);
		assertEquals("", actual);
	}

	/*
	 * ROOST_METHOD_HASH=convertTurkishToLatin_793c35417c
	 * ROOST_METHOD_SIG_HASH=convertTurkishToLatin_39fc57c16b
	 *
	 */void nonTurkishCharacterString() {
		String input = "HelloWorld123";
		String actual = TurkishToLatinConversion.convertTurkishToLatin(input);
		assertEquals(input, actual);
	}

	/*
	 * ROOST_METHOD_HASH=convertTurkishToLatin_793c35417c
	 * ROOST_METHOD_SIG_HASH=convertTurkishToLatin_39fc57c16b
	 *
	 */void mixedCharacterString() {
		String input = "Hellöİşçğ123";
		String expected = "HelloIscg123";
		String actual = TurkishToLatinConversion.convertTurkishToLatin(input);
		assertEquals(expected, actual);
	}

	/*
	 * ROOST_METHOD_HASH=convertTurkishToLatin_793c35417c
	 * ROOST_METHOD_SIG_HASH=convertTurkishToLatin_39fc57c16b
	 *
	 */void multipleOccurrencesTurkishChars() {
		String input = "şşşİİİööö";
		String expected = "sssIIIooo";
		String actual = TurkishToLatinConversion.convertTurkishToLatin(input);
		assertEquals(expected, actual);
	}

	/*
	 * ROOST_METHOD_HASH=convertTurkishToLatin_793c35417c
	 * ROOST_METHOD_SIG_HASH=convertTurkishToLatin_39fc57c16b
	 *
	 */void nullInputHandling() {
		assertThrows(NullPointerException.class, () -> {
			TurkishToLatinConversion.convertTurkishToLatin(null);
		});
	}

	/*
	 * ROOST_METHOD_HASH=convertTurkishToLatin_793c35417c
	 * ROOST_METHOD_SIG_HASH=convertTurkishToLatin_39fc57c16b
	 *
	 */void specialCharactersCombination() {
		String input = "ş@İ#ö$ç%123";
		String expected = "s@I#o$c%123";
		String actual = TurkishToLatinConversion.convertTurkishToLatin(input);
		assertEquals(expected, actual);
	}

}