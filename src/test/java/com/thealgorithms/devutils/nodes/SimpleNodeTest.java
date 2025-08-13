package com.thealgorithms.devutils.nodes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;

public class SimpleNodeTest {

	/*
	 * ROOST_METHOD_HASH=getNextNode_cd4583d218
	 * ROOST_METHOD_SIG_HASH=getNextNode_b2f2da467a
	 *
	 */void getNextNodeWhenNodeIsLast() {
		SimpleNode<Integer> node = new SimpleNode<>(1);
		assertNull(node.getNextNode());
	}

	/*
	 * ROOST_METHOD_HASH=getNextNode_cd4583d218
	 * ROOST_METHOD_SIG_HASH=getNextNode_b2f2da467a
	 *
	 */void getNextNodeWhenNextNodeExists() {
		SimpleNode<Integer> firstNode = new SimpleNode<>(1);
		SimpleNode<Integer> secondNode = new SimpleNode<>(2);
		firstNode.setNextNode(secondNode);
		assertEquals(secondNode, firstNode.getNextNode());
	}

	/*
	 * ROOST_METHOD_HASH=getNextNode_cd4583d218
	 * ROOST_METHOD_SIG_HASH=getNextNode_b2f2da467a
	 *
	 */void getNextNodeAfterMultipleSetOperations() {
		SimpleNode<Integer> firstNode = new SimpleNode<>(1);
		SimpleNode<Integer> secondNode = new SimpleNode<>(2);
		SimpleNode<Integer> thirdNode = new SimpleNode<>(3);
		firstNode.setNextNode(secondNode);
		firstNode.setNextNode(thirdNode);
		assertEquals(thirdNode, firstNode.getNextNode());
	}

	/*
	 * ROOST_METHOD_HASH=getNextNode_cd4583d218
	 * ROOST_METHOD_SIG_HASH=getNextNode_b2f2da467a
	 *
	 */void verifyNextNodeConsistencyWithHasNext() {
		SimpleNode<Integer> firstNode = new SimpleNode<>(1);
		SimpleNode<Integer> secondNode = new SimpleNode<>(2);

		assertFalse(firstNode.hasNext());
		assertNull(firstNode.getNextNode());

		firstNode.setNextNode(secondNode);
		assertTrue(firstNode.hasNext());
		assertNotNull(firstNode.getNextNode());
		assertEquals(secondNode, firstNode.getNextNode());
	}

	/*
	 * ROOST_METHOD_HASH=getNextNode_cd4583d218
	 * ROOST_METHOD_SIG_HASH=getNextNode_b2f2da467a
	 *
	 */void getNextNodeWithNullData() {
		SimpleNode<Integer> node = new SimpleNode<>();
		assertNull(node.getNextNode());
	}

	/*
	 * ROOST_METHOD_HASH=getNextNode_cd4583d218
	 * ROOST_METHOD_SIG_HASH=getNextNode_b2f2da467a
	 *
	 */void getNextNodeWithConstructorInitialization() {
		SimpleNode<Integer> secondNode = new SimpleNode<>(2);
		SimpleNode<Integer> firstNode = new SimpleNode<>(1, secondNode);
		assertEquals(secondNode, firstNode.getNextNode());
	}

}