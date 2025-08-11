package com.thealgorithms.datastructures.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import org.junit.jupiter.api;

public class GenericArrayListQueueTest {

	/*
	 * ROOST_METHOD_HASH=pull_427c4054ef ROOST_METHOD_SIG_HASH=pull_8e789e5247
	 *
	 */void setUp() {
		queue = new GenericArrayListQueue<>();
	}

	/*
	 * ROOST_METHOD_HASH=pull_427c4054ef ROOST_METHOD_SIG_HASH=pull_8e789e5247
	 *
	 */void pullFromEmptyQueue() {
		assertNull(queue.pull());
	}

	/*
	 * ROOST_METHOD_HASH=pull_427c4054ef ROOST_METHOD_SIG_HASH=pull_8e789e5247
	 *
	 */void pullSingleElement() {
		queue.add(1);
		assertEquals(1, queue.pull());
		assertNull(queue.pull());
	}

	/*
	 * ROOST_METHOD_HASH=pull_427c4054ef ROOST_METHOD_SIG_HASH=pull_8e789e5247
	 *
	 */void pullMultipleElements() {
		queue.add(1);
		queue.add(2);
		queue.add(3);
		assertEquals(1, queue.pull());
		assertEquals(2, queue.pull());
		assertEquals(3, queue.pull());
		assertNull(queue.pull());
	}

	/*
	 * ROOST_METHOD_HASH=pull_427c4054ef ROOST_METHOD_SIG_HASH=pull_8e789e5247
	 *
	 */void pullAfterAddingAndRemoving() {
		queue.add(1);
		queue.pull();
		queue.add(2);
		assertEquals(2, queue.pull());
		assertNull(queue.pull());
	}

	/*
	 * ROOST_METHOD_HASH=pull_427c4054ef ROOST_METHOD_SIG_HASH=pull_8e789e5247
	 *
	 */void pullUntilEmpty() {
		queue.add(1);
		queue.add(2);
		assertNotNull(queue.pull());
		assertNotNull(queue.pull());
		assertNull(queue.pull());
	}

}