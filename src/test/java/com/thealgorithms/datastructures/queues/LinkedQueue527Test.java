package com.thealgorithms.datastructures.queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import org.junit.jupiter.api;
import java.util.Iterator;
import java.util.StringJoiner;

public class LinkedQueue527Test {

	/*
	 * ROOST_METHOD_HASH=peekFront_015e60ffc3 ROOST_METHOD_SIG_HASH=peekFront_9ce1383b75
	 *
	 */void setUp() {
		queue = new LinkedQueue<>();
	}

	/*
	 * ROOST_METHOD_HASH=peekFront_015e60ffc3 ROOST_METHOD_SIG_HASH=peekFront_9ce1383b75
	 *
	 */void peekFrontFromNonEmptyQueue() {

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		int initialSize = queue.size();

		int frontElement = queue.peekFront();

		assertEquals(1, frontElement);
		assertEquals(initialSize, queue.size());
		assertEquals("[1, 2, 3]", queue.toString());
	}

	/*
	 * ROOST_METHOD_HASH=peekFront_015e60ffc3 ROOST_METHOD_SIG_HASH=peekFront_9ce1383b75
	 *
	 */void peekFrontFromEmptyQueue() {

		NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> queue.peekFront());
		assertEquals("queue is empty", exception.getMessage());
	}

	/*
	 * ROOST_METHOD_HASH=peekFront_015e60ffc3 ROOST_METHOD_SIG_HASH=peekFront_9ce1383b75
	 *
	 */void peekFrontAfterDequeue() {

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.dequeue();

		int frontElement = queue.peekFront();

		assertEquals(2, frontElement);
		assertEquals(2, queue.size());
		assertEquals("[2, 3]", queue.toString());
	}

	/*
	 * ROOST_METHOD_HASH=peekFront_015e60ffc3 ROOST_METHOD_SIG_HASH=peekFront_9ce1383b75
	 *
	 */void peekFrontAfterClear() {

		queue.enqueue(1);
		queue.enqueue(2);
		queue.clear();

		NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> queue.peekFront());
		assertEquals("queue is empty", exception.getMessage());
		assertTrue(queue.isEmpty());
	}

}