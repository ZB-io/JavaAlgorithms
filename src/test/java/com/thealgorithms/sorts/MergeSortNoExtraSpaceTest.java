package com.thealgorithms.sorts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;
import org.junit.jupiter.api;
import java.util.Scanner;

public class MergeSortNoExtraSpaceTest {

	/*
	 * ROOST_METHOD_HASH=callMergeSort_4366be4c27
	 * ROOST_METHOD_SIG_HASH=callMergeSort_310b98658e
	 *
	 */void sortPositiveIntegers() {

		int[] array = { 5, 2, 8, 1, 9 };
		int n = 5;
		int[] expected = { 1, 2, 5, 8, 9 };

		MergeSortNoExtraSpace.callMergeSort(array, n);

		assertArrayEquals(expected, array);
	}

	/*
	 * ROOST_METHOD_HASH=callMergeSort_4366be4c27
	 * ROOST_METHOD_SIG_HASH=callMergeSort_310b98658e
	 *
	 */void sortSingleElementArray() {
		int[] array = { 1 };
		int n = 1;
		int[] expected = { 1 };
		MergeSortNoExtraSpace.callMergeSort(array, n);
		assertArrayEquals(expected, array);
	}

	/*
	 * ROOST_METHOD_HASH=callMergeSort_4366be4c27
	 * ROOST_METHOD_SIG_HASH=callMergeSort_310b98658e
	 *
	 */void sortAlreadySortedArray() {
		int[] array = { 1, 2, 3, 4, 5 };
		int n = 5;
		int[] expected = { 1, 2, 3, 4, 5 };
		MergeSortNoExtraSpace.callMergeSort(array, n);
		assertArrayEquals(expected, array);
	}

	/*
	 * ROOST_METHOD_HASH=callMergeSort_4366be4c27
	 * ROOST_METHOD_SIG_HASH=callMergeSort_310b98658e
	 *
	 */void sortReverseSortedArray() {
		int[] array = { 5, 4, 3, 2, 1 };
		int n = 5;
		int[] expected = { 1, 2, 3, 4, 5 };
		MergeSortNoExtraSpace.callMergeSort(array, n);
		assertArrayEquals(expected, array);
	}

	/*
	 * ROOST_METHOD_HASH=callMergeSort_4366be4c27
	 * ROOST_METHOD_SIG_HASH=callMergeSort_310b98658e
	 *
	 */void sortArrayWithDuplicates() {
		int[] array = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
		int n = 10;
		int[] expected = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 9 };
		MergeSortNoExtraSpace.callMergeSort(array, n);
		assertArrayEquals(expected, array);
	}

	/*
	 * ROOST_METHOD_HASH=callMergeSort_4366be4c27
	 * ROOST_METHOD_SIG_HASH=callMergeSort_310b98658e
	 *
	 */void sortEmptyArray() {
		int[] array = {};
		int n = 0;
		int[] expected = {};
		MergeSortNoExtraSpace.callMergeSort(array, n);
		assertArrayEquals(expected, array);
	}

}