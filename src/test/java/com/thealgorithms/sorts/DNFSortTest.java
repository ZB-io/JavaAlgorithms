package com.thealgorithms.sorts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api;

public class DNFSortTest {

	/*
	 * ROOST_METHOD_HASH=printArray_59c8c2b49e ROOST_METHOD_SIG_HASH=printArray_c6414028ce
	 *
	 */void setUp() {
		System.setOut(new PrintStream(outContent));
	}

	/*
	 * ROOST_METHOD_HASH=printArray_59c8c2b49e ROOST_METHOD_SIG_HASH=printArray_c6414028ce
	 *
	 */void restoreStreams() {
		System.setOut(originalOut);
	}

	/*
	 * ROOST_METHOD_HASH=printArray_59c8c2b49e ROOST_METHOD_SIG_HASH=printArray_c6414028ce
	 *
	 */void printArrayWithValidInput() {
		int[] arr = { 1, 2, 3, 4, 5 };
		DNFSort.printArray(arr, 5);
		assertEquals("1 2 3 4 5 \n", outContent.toString());
	}

	/*
	 * ROOST_METHOD_HASH=printArray_59c8c2b49e ROOST_METHOD_SIG_HASH=printArray_c6414028ce
	 *
	 */void printEmptyArray() {
		int[] arr = {};
		DNFSort.printArray(arr, 0);
		assertEquals("\n", outContent.toString());
	}

	/*
	 * ROOST_METHOD_HASH=printArray_59c8c2b49e ROOST_METHOD_SIG_HASH=printArray_c6414028ce
	 *
	 */void printSingleElementArray() {
		int[] arr = { 42 };
		DNFSort.printArray(arr, 1);
		assertEquals("42 \n", outContent.toString());
	}

	/*
	 * ROOST_METHOD_HASH=printArray_59c8c2b49e ROOST_METHOD_SIG_HASH=printArray_c6414028ce
	 *
	 */void printArrayWithSizeMismatch() {
		int[] arr = { 1, 2, 3, 4, 5 };
		DNFSort.printArray(arr, 3);
		assertEquals("1 2 3 \n", outContent.toString());
	}

	/*
	 * ROOST_METHOD_HASH=printArray_59c8c2b49e ROOST_METHOD_SIG_HASH=printArray_c6414028ce
	 *
	 */void printArrayWithNegativeNumbers() {
		int[] arr = { -1, 0, -5, 10, -3 };
		DNFSort.printArray(arr, 5);
		assertEquals("-1 0 -5 10 -3 \n", outContent.toString());
	}

}