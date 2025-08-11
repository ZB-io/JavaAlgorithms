package com.thealgorithms.datastructures.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CircularQueueTest {

	/*
	 * ROOST_METHOD_HASH=enQueue_b37dccecb7 ROOST_METHOD_SIG_HASH=enQueue_ac71ba7e33
	 *
	 */void setUp() {
		queue = new CircularQueue(5);
	}

	/*
	 * ROOST_METHOD_HASH=enQueue_b37dccecb7 ROOST_METHOD_SIG_HASH=enQueue_ac71ba7e33
	 *
	 */void enqueueToEmptyQueue() {
		assertTrue(queue.isEmpty());
		queue.enQueue(10);
		assertFalse(queue.isEmpty());
		assertEquals(10, queue.peek());
	}

	/*
	 * ROOST_METHOD_HASH=enQueue_b37dccecb7 ROOST_METHOD_SIG_HASH=enQueue_ac71ba7e33
	 *
	 */void enqueueToFullQueue() {
		queue = new CircularQueue(3);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		assertTrue(queue.isFull());
		assertEquals(1, queue.peek());
	}

	/*
	 * ROOST_METHOD_HASH=enQueue_b37dccecb7 ROOST_METHOD_SIG_HASH=enQueue_ac71ba7e33
	 *
	 */void circularEnqueueAfterDequeue() {
		queue = new CircularQueue(3);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.deQueue();
		queue.enQueue(4);
		assertEquals(2, queue.peek());
		assertFalse(queue.isEmpty());
	}

	/*
	 * ROOST_METHOD_HASH=enQueue_b37dccecb7 ROOST_METHOD_SIG_HASH=enQueue_ac71ba7e33
	 *
	 */void multipleEnqueueOperations() {
		queue = new CircularQueue(4);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		assertEquals(1, queue.peek());
		assertFalse(queue.isFull());
	}

	/*
	 * ROOST_METHOD_HASH=enQueue_b37dccecb7 ROOST_METHOD_SIG_HASH=enQueue_ac71ba7e33
	 *
	 */void enqueueAfterQueueReset() {
		queue = new CircularQueue(3);
		queue.deleteQueue();
		queue = new CircularQueue(3);
		queue.enQueue(1);
		assertFalse(queue.isEmpty());
		assertEquals(1, queue.peek());
	}

	/*
	 * ROOST_METHOD_HASH=deQueue_6a3be34dbf ROOST_METHOD_SIG_HASH=deQueue_181c42e4db
	 *
	 */void setUp() {
		circularQueue = new CircularQueue(5);
	}

	/*
	 * ROOST_METHOD_HASH=deQueue_6a3be34dbf ROOST_METHOD_SIG_HASH=deQueue_181c42e4db
	 *
	 */void dequeueFromEmptyQueue() {
		assertEquals(-1, circularQueue.deQueue());
	}

	/*
	 * ROOST_METHOD_HASH=deQueue_6a3be34dbf ROOST_METHOD_SIG_HASH=deQueue_181c42e4db
	 *
	 */void dequeueFromQueueWithOneElement() {
		circularQueue.enQueue(10);
		assertEquals(10, circularQueue.deQueue());
		assertTrue(circularQueue.isEmpty());
	}

	/*
	 * ROOST_METHOD_HASH=deQueue_6a3be34dbf ROOST_METHOD_SIG_HASH=deQueue_181c42e4db
	 *
	 */void dequeueFromQueueWithMultipleElements() {
		circularQueue.enQueue(1);
		circularQueue.enQueue(2);
		circularQueue.enQueue(3);
		assertEquals(1, circularQueue.deQueue());
		assertEquals(2, circularQueue.deQueue());
		assertEquals(3, circularQueue.deQueue());
		assertTrue(circularQueue.isEmpty());
	}

	/*
	 * ROOST_METHOD_HASH=deQueue_6a3be34dbf ROOST_METHOD_SIG_HASH=deQueue_181c42e4db
	 *
	 */void dequeueWhenBeginningReachesEnd() {
		circularQueue.enQueue(1);
		circularQueue.enQueue(2);
		circularQueue.enQueue(3);
		circularQueue.enQueue(4);
		circularQueue.enQueue(5);
		assertEquals(1, circularQueue.deQueue());
		circularQueue.enQueue(6);
		assertEquals(2, circularQueue.deQueue());
		assertEquals(3, circularQueue.deQueue());
		assertEquals(4, circularQueue.deQueue());
		assertEquals(5, circularQueue.deQueue());
		assertEquals(6, circularQueue.deQueue());
		assertTrue(circularQueue.isEmpty());
	}

	/*
	 * ROOST_METHOD_HASH=deQueue_6a3be34dbf ROOST_METHOD_SIG_HASH=deQueue_181c42e4db
	 *
	 */void dequeueAfterWraparound() {
		circularQueue.enQueue(1);
		circularQueue.enQueue(2);
		circularQueue.enQueue(3);
		circularQueue.enQueue(4);
		circularQueue.enQueue(5);
		assertEquals(1, circularQueue.deQueue());
		assertEquals(2, circularQueue.deQueue());
		circularQueue.enQueue(6);
		circularQueue.enQueue(7);
		assertEquals(3, circularQueue.deQueue());
		assertEquals(4, circularQueue.deQueue());
		assertEquals(5, circularQueue.deQueue());
		assertEquals(6, circularQueue.deQueue());
		assertEquals(7, circularQueue.deQueue());
		assertTrue(circularQueue.isEmpty());
	}

	/*
	 * ROOST_METHOD_HASH=deleteQueue_73980aa213
	 * ROOST_METHOD_SIG_HASH=deleteQueue_c941cede05
	 *
	 */void setUp() {
		System.setOut(new PrintStream(outputStream));
		circularQueue = new CircularQueue(5);
	}

	/*
	 * ROOST_METHOD_HASH=deleteQueue_73980aa213
	 * ROOST_METHOD_SIG_HASH=deleteQueue_c941cede05
	 *
	 */void deleteEmptyQueue() {
		assertTrue(circularQueue.isEmpty());
		circularQueue.deleteQueue();
		assertNull(circularQueue.arr);
		assertTrue(outputStream.toString().contains("The Queue is deleted!"));
	}

	/*
	 * ROOST_METHOD_HASH=deleteQueue_73980aa213
	 * ROOST_METHOD_SIG_HASH=deleteQueue_c941cede05
	 *
	 */void deleteQueueWithElements() {
		circularQueue.enQueue(1);
		circularQueue.enQueue(2);
		circularQueue.enQueue(3);
		circularQueue.deleteQueue();
		assertNull(circularQueue.arr);
		assertTrue(outputStream.toString().contains("The Queue is deleted!"));
	}

	/*
	 * ROOST_METHOD_HASH=deleteQueue_73980aa213
	 * ROOST_METHOD_SIG_HASH=deleteQueue_c941cede05
	 *
	 */void deleteQueueAndAttemptOperations() {
		circularQueue.enQueue(1);
		circularQueue.enQueue(2);
		circularQueue.deleteQueue();
		assertEquals(-1, circularQueue.peek());
		assertTrue(outputStream.toString().contains("The Queue is Empty!"));
	}

	/*
	 * ROOST_METHOD_HASH=deleteQueue_73980aa213
	 * ROOST_METHOD_SIG_HASH=deleteQueue_c941cede05
	 *
	 */void multipleDeleteOperations() {
		circularQueue.deleteQueue();
		circularQueue.deleteQueue();
		circularQueue.deleteQueue();
		assertNull(circularQueue.arr);
		String output = outputStream.toString();
		int count = output.split("The Queue is deleted!").length - 1;
		assertEquals(3, count);
	}

	/*
	 * ROOST_METHOD_HASH=deleteQueue_73980aa213
	 * ROOST_METHOD_SIG_HASH=deleteQueue_c941cede05
	 *
	 */void deleteQueueAfterFullOperations() {
		circularQueue.enQueue(1);
		circularQueue.enQueue(2);
		circularQueue.enQueue(3);
		circularQueue.deQueue();
		circularQueue.enQueue(4);
		circularQueue.deleteQueue();
		assertNull(circularQueue.arr);
		assertTrue(outputStream.toString().contains("The Queue is deleted!"));
	}

}