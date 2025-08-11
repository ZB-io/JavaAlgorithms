package com.thealgorithms.datastructures.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;

public class DequesTest {

	/*
	 * ROOST_METHOD_HASH=pollFirst_94d4f34e0c ROOST_METHOD_SIG_HASH=pollFirst_a731310fac
	 *
	 */void setUp() {
		deque = new Deques<>();
	}

	/*
	 * ROOST_METHOD_HASH=pollFirst_94d4f34e0c ROOST_METHOD_SIG_HASH=pollFirst_a731310fac
	 *
	 */void pollFirstFromEmptyDeque() {
		assertNull(deque.pollFirst());
		assertEquals(0, deque.size());
		assertTrue(deque.isEmpty());
	}

	/*
	 * ROOST_METHOD_HASH=pollFirst_94d4f34e0c ROOST_METHOD_SIG_HASH=pollFirst_a731310fac
	 *
	 */void pollFirstFromSingleElementDeque() {
		deque.addFirst(1);
		assertEquals(1, deque.pollFirst());
		assertEquals(0, deque.size());
		assertTrue(deque.isEmpty());
		assertNull(deque.pollFirst());
	}

	/*
	 * ROOST_METHOD_HASH=pollFirst_94d4f34e0c ROOST_METHOD_SIG_HASH=pollFirst_a731310fac
	 *
	 */void pollFirstFromMultiElementDeque() {
		deque.addFirst(3);
		deque.addFirst(2);
		deque.addFirst(1);
		assertEquals(1, deque.pollFirst());
		assertEquals(2, deque.size());
		assertEquals(2, deque.peekFirst());
		assertEquals("Head -> 2 <-> 3 <- Tail", deque.toString());
	}

	/*
	 * ROOST_METHOD_HASH=pollFirst_94d4f34e0c ROOST_METHOD_SIG_HASH=pollFirst_a731310fac
	 *
	 */void sequentialPollFirstOperations() {
		deque.addFirst(3);
		deque.addFirst(2);
		deque.addFirst(1);
		assertEquals(1, deque.pollFirst());
		assertEquals(2, deque.pollFirst());
		assertEquals(3, deque.pollFirst());
		assertNull(deque.pollFirst());
		assertEquals(0, deque.size());
		assertTrue(deque.isEmpty());
	}

	/*
	 * ROOST_METHOD_HASH=pollFirst_94d4f34e0c ROOST_METHOD_SIG_HASH=pollFirst_a731310fac
	 *
	 */void pollFirstAfterMixedOperations() {
		deque.addFirst(2);
		deque.addLast(3);
		deque.addFirst(1);
		assertEquals(1, deque.pollFirst());
		assertEquals(2, deque.size());
		assertEquals(2, deque.peekFirst());
		assertEquals(3, deque.peekLast());
	}

	/*
	 * ROOST_METHOD_HASH=pollLast_3d58010b92 ROOST_METHOD_SIG_HASH=pollLast_9c5c65a068
	 *
	 */void setUp() {
		deque = new Deques<>();
	}

	/*
	 * ROOST_METHOD_HASH=pollLast_3d58010b92 ROOST_METHOD_SIG_HASH=pollLast_9c5c65a068
	 *
	 */void pollLastFromEmptyDeque() {
		assertNull(deque.pollLast());
		assertEquals(0, deque.size());
		assertTrue(deque.isEmpty());
	}

	/*
	 * ROOST_METHOD_HASH=pollLast_3d58010b92 ROOST_METHOD_SIG_HASH=pollLast_9c5c65a068
	 *
	 */void pollLastFromSingleElementDeque() {
		deque.addFirst(5);
		Integer result = deque.pollLast();
		assertEquals(5, result);
		assertEquals(0, deque.size());
		assertTrue(deque.isEmpty());
	}

	/*
	 * ROOST_METHOD_HASH=pollLast_3d58010b92 ROOST_METHOD_SIG_HASH=pollLast_9c5c65a068
	 *
	 */void pollLastFromMultiElementDeque() {
		deque.addFirst(1);
		deque.addLast(2);
		deque.addLast(3);
		Integer result = deque.pollLast();
		assertEquals(3, result);
		assertEquals(2, deque.size());
		assertEquals(2, deque.peekLast());
		assertEquals("Head -> 1 <-> 2 <- Tail", deque.toString());
	}

	/*
	 * ROOST_METHOD_HASH=pollLast_3d58010b92 ROOST_METHOD_SIG_HASH=pollLast_9c5c65a068
	 *
	 */void sequentialPollLastOperations() {
		deque.addLast(1);
		deque.addLast(2);
		deque.addLast(3);
		assertEquals(3, deque.pollLast());
		assertEquals(2, deque.pollLast());
		assertEquals(1, deque.pollLast());
		assertEquals(0, deque.size());
		assertTrue(deque.isEmpty());
		assertNull(deque.pollLast());
	}

	/*
	 * ROOST_METHOD_HASH=pollLast_3d58010b92 ROOST_METHOD_SIG_HASH=pollLast_9c5c65a068
	 *
	 */void mixedOperationsWithPollLast() {
		deque.addFirst(1);
		deque.addLast(2);
		assertEquals(2, deque.pollLast());
		deque.addLast(3);
		assertEquals(3, deque.pollLast());
		assertEquals(1, deque.size());
		assertEquals(1, deque.peekFirst());
	}

	/*
	 * ROOST_METHOD_HASH=peekFirst_ece2054e28 ROOST_METHOD_SIG_HASH=peekFirst_f8d9cc0b66
	 *
	 */void setUp() {
		deque = new Deques<>();
	}

	/*
	 * ROOST_METHOD_HASH=peekFirst_ece2054e28 ROOST_METHOD_SIG_HASH=peekFirst_f8d9cc0b66
	 *
	 */void peekFirstFromNonEmptyDeque() {

		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		int expectedSize = deque.size();

		Integer peekedElement = deque.peekFirst();

		assertEquals(3, peekedElement);
		assertEquals(expectedSize, deque.size());

		assertEquals(3, deque.peekFirst());
	}

	/*
	 * ROOST_METHOD_HASH=peekFirst_ece2054e28 ROOST_METHOD_SIG_HASH=peekFirst_f8d9cc0b66
	 *
	 */void peekFirstFromSingleElementDeque() {

		deque.addFirst(1);
		int expectedSize = deque.size();

		Integer peekedElement = deque.peekFirst();

		assertEquals(1, peekedElement);
		assertEquals(expectedSize, deque.size());
	}

	/*
	 * ROOST_METHOD_HASH=peekFirst_ece2054e28 ROOST_METHOD_SIG_HASH=peekFirst_f8d9cc0b66
	 *
	 */void peekFirstFromEmptyDequeShouldThrowException() {

		assertThrows(NullPointerException.class, () -> {
			deque.peekFirst();
		});
	}

	/*
	 * ROOST_METHOD_HASH=peekFirst_ece2054e28 ROOST_METHOD_SIG_HASH=peekFirst_f8d9cc0b66
	 *
	 */void peekFirstAfterMultipleOperations() {

		deque.addFirst(1);
		deque.addLast(2);
		deque.addFirst(3);
		int expectedSize = deque.size();

		Integer peekedElement = deque.peekFirst();

		assertEquals(3, peekedElement);
		assertEquals(expectedSize, deque.size());
	}

	/*
	 * ROOST_METHOD_HASH=peekLast_e873151ad3 ROOST_METHOD_SIG_HASH=peekLast_147af3c4b7
	 *
	 */void setUp() {
		deque = new Deques<>();
	}

	/*
	 * ROOST_METHOD_HASH=peekLast_e873151ad3 ROOST_METHOD_SIG_HASH=peekLast_147af3c4b7
	 *
	 */void peekLastFromEmptyDeque() {
		assertThrows(NullPointerException.class, () -> deque.peekLast());
	}

	/*
	 * ROOST_METHOD_HASH=peekLast_e873151ad3 ROOST_METHOD_SIG_HASH=peekLast_147af3c4b7
	 *
	 */void peekLastFromSingleElementDeque() {
		deque.addLast(5);
		assertEquals(5, deque.peekLast());
		assertEquals(1, deque.size());
	}

	/*
	 * ROOST_METHOD_HASH=peekLast_e873151ad3 ROOST_METHOD_SIG_HASH=peekLast_147af3c4b7
	 *
	 */void peekLastFromMultiElementDeque() {
		deque.addLast(1);
		deque.addLast(2);
		deque.addLast(3);
		assertEquals(3, deque.peekLast());
		assertEquals(3, deque.size());
	}

	/*
	 * ROOST_METHOD_HASH=peekLast_e873151ad3 ROOST_METHOD_SIG_HASH=peekLast_147af3c4b7
	 *
	 */void peekLastAfterMultipleOperations() {
		deque.addFirst(1);
		deque.addLast(2);
		deque.addFirst(3);
		deque.pollFirst();
		assertEquals(2, deque.peekLast());
		assertEquals(2, deque.size());
	}

	/*
	 * ROOST_METHOD_HASH=peekLast_e873151ad3 ROOST_METHOD_SIG_HASH=peekLast_147af3c4b7
	 *
	 */void multipleConsecutivePeekLast() {
		deque.addLast(1);
		deque.addLast(2);
		assertEquals(2, deque.peekLast());
		assertEquals(2, deque.size());
		assertEquals(2, deque.peekLast());
		assertEquals(2, deque.size());
		assertEquals(2, deque.peekLast());
		assertEquals(2, deque.size());
	}

}