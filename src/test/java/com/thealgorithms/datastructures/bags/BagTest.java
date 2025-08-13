package com.thealgorithms.datastructures.bags;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;

public class BagTest {

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

}