package com.thealgorithms.datastructures.bags;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;

public class Bag147Test {

	/*
	 * ROOST_METHOD_HASH=hasNext_846bbf1b43 ROOST_METHOD_SIG_HASH=hasNext_bba7213498
	 *
	 */void hasNextWithNonEmptyBag() {

		Bag<String> bag = new Bag<>();
		bag.add("test");
		Iterator<String> iterator = bag.iterator();

		assertTrue(iterator.hasNext());
	}

	/*
	 * ROOST_METHOD_HASH=hasNext_846bbf1b43 ROOST_METHOD_SIG_HASH=hasNext_bba7213498
	 *
	 */void hasNextWithEmptyBag() {

		Bag<String> bag = new Bag<>();
		Iterator<String> iterator = bag.iterator();

		assertFalse(iterator.hasNext());
	}

	/*
	 * ROOST_METHOD_HASH=hasNext_846bbf1b43 ROOST_METHOD_SIG_HASH=hasNext_bba7213498
	 *
	 */void hasNextWithMultipleElements() {

		Bag<Integer> bag = new Bag<>();
		bag.add(1);
		bag.add(2);
		bag.add(3);
		Iterator<Integer> iterator = bag.iterator();

		assertTrue(iterator.hasNext());

		iterator.next();
		assertTrue(iterator.hasNext());

		iterator.next();
		assertTrue(iterator.hasNext());

		iterator.next();
		assertFalse(iterator.hasNext());
	}

	/*
	 * ROOST_METHOD_HASH=hasNext_846bbf1b43 ROOST_METHOD_SIG_HASH=hasNext_bba7213498
	 *
	 */void hasNextAfterConsumingAllElements() {

		Bag<String> bag = new Bag<>();
		bag.add("test");
		Iterator<String> iterator = bag.iterator();

		iterator.next();

		assertFalse(iterator.hasNext());
	}

	/*
	 * ROOST_METHOD_HASH=hasNext_846bbf1b43 ROOST_METHOD_SIG_HASH=hasNext_bba7213498
	 *
	 */void hasNextWithNullElement() {

		Bag<String> bag = new Bag<>();
		bag.add(null);
		Iterator<String> iterator = bag.iterator();

		assertTrue(iterator.hasNext());
		assertNull(iterator.next());
		assertFalse(iterator.hasNext());
	}

	/*
	 * ROOST_METHOD_HASH=hasNext_846bbf1b43 ROOST_METHOD_SIG_HASH=hasNext_bba7213498
	 *
	 */void hasNextMultipleCallsSameResult() {

		Bag<Integer> bag = new Bag<>();
		bag.add(1);
		Iterator<Integer> iterator = bag.iterator();

		assertTrue(iterator.hasNext());

		assertTrue(iterator.hasNext());
		assertTrue(iterator.hasNext());
	}

	/*
	 * ROOST_METHOD_HASH=hasNext_846bbf1b43 ROOST_METHOD_SIG_HASH=hasNext_bba7213498
	 *
	 */void hasNextAfterRemovingElements() {

		Bag<String> bag = new Bag<>();
		bag.add("first");
		bag.add("second");
		Iterator<String> iterator = bag.iterator();

		assertTrue(iterator.hasNext());
		assertEquals("first", iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals("second", iterator.next());
		assertFalse(iterator.hasNext());
	}

	/*
	 * ROOST_METHOD_HASH=next_c26db55db8 ROOST_METHOD_SIG_HASH=next_1fbe535516
	 *
	 */void retrieveNextElementFromNonEmptyList() {
		Bag<String> bag = new Bag<>();
		bag.add("first");
		bag.add("second");
		Iterator<String> iterator = bag.iterator();
		String firstElement = iterator.next();
		assertEquals("second", firstElement);
		String secondElement = iterator.next();
		assertEquals("first", secondElement);
	}

	/*
	 * ROOST_METHOD_HASH=next_c26db55db8 ROOST_METHOD_SIG_HASH=next_1fbe535516
	 *
	 */void throwExceptionWhenNextCalledOnEmptyIterator() {
		Bag<String> bag = new Bag<>();
		Iterator<String> iterator = bag.iterator();
		assertThrows(NoSuchElementException.class, iterator::next);
	}

	/*
	 * ROOST_METHOD_HASH=next_c26db55db8 ROOST_METHOD_SIG_HASH=next_1fbe535516
	 *
	 */void multipleNextCallsInSequence() {
		Bag<Integer> bag = new Bag<>();
		bag.add(3);
		bag.add(2);
		bag.add(1);
		Iterator<Integer> iterator = bag.iterator();
		assertEquals(1, iterator.next());
		assertEquals(2, iterator.next());
		assertEquals(3, iterator.next());
	}

	/*
	 * ROOST_METHOD_HASH=next_c26db55db8 ROOST_METHOD_SIG_HASH=next_1fbe535516
	 *
	 */void nextCallAfterReachingEnd() {
		Bag<String> bag = new Bag<>();
		bag.add("only");
		Iterator<String> iterator = bag.iterator();

		iterator.next();
		assertThrows(NoSuchElementException.class, iterator::next);
	}

	/*
	 * ROOST_METHOD_HASH=next_c26db55db8 ROOST_METHOD_SIG_HASH=next_1fbe535516
	 *
	 */void nextCallWithSingleElement() {
		Bag<Integer> bag = new Bag<>();
		bag.add(42);
		Iterator<Integer> iterator = bag.iterator();
		assertEquals(42, iterator.next());
		assertThrows(NoSuchElementException.class, iterator::next);
	}

	/*
	 * ROOST_METHOD_HASH=next_c26db55db8 ROOST_METHOD_SIG_HASH=next_1fbe535516
	 *
	 */void nextCallWithNullElements() {
		Bag<String> bag = new Bag<>();
		bag.add(null);
		bag.add("notNull");
		Iterator<String> iterator = bag.iterator();
		assertNull(iterator.next());
		assertEquals("notNull", iterator.next());
	}

	/*
	 * ROOST_METHOD_HASH=next_c26db55db8 ROOST_METHOD_SIG_HASH=next_1fbe535516
	 *
	 */void nextCallWithLargeNumberOfElements() {
		Bag<Integer> bag = new Bag<>();
		final int elementCount = 1000;
		for (int i = 0; i < elementCount; i++) {
			bag.add(i);
		}
		Iterator<Integer> iterator = bag.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			assertNotNull(iterator.next());
			count++;
		}
		assertEquals(elementCount, count);
	}

	/*
	 * ROOST_METHOD_HASH=next_c26db55db8 ROOST_METHOD_SIG_HASH=next_1fbe535516
	 *
	 */void alternatingNextAndHasNextCalls() {
		Bag<String> bag = new Bag<>();
		bag.add("first");
		bag.add("second");
		bag.add("third");
		Iterator<String> iterator = bag.iterator();
		assertTrue(iterator.hasNext());
		assertEquals("third", iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals("second", iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals("first", iterator.next());
		assertFalse(iterator.hasNext());
	}

}