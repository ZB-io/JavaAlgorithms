package com.thealgorithms.devutils.nodes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;

public class SimpleTreeNodeTest {

	/*
	 * ROOST_METHOD_HASH=isLeafNode_260950b307 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isLeafNodeWhenBothChildrenNull() {
		SimpleTreeNode<Integer> node = new SimpleTreeNode<>(1);
		assertTrue(node.isLeafNode());
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_260950b307 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isNotLeafNodeWhenLeftChildExists() {
		SimpleTreeNode<Integer> node = new SimpleTreeNode<>(1);
		node.setLeftNode(new SimpleTreeNode<>(2));
		assertFalse(node.isLeafNode());
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_260950b307 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isNotLeafNodeWhenRightChildExists() {
		SimpleTreeNode<Integer> node = new SimpleTreeNode<>(1);
		node.setRightNode(new SimpleTreeNode<>(2));
		assertFalse(node.isLeafNode());
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_260950b307 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isNotLeafNodeWhenBothChildrenExist() {
		SimpleTreeNode<Integer> node = new SimpleTreeNode<>(1);
		node.setLeftNode(new SimpleTreeNode<>(2));
		node.setRightNode(new SimpleTreeNode<>(3));
		assertFalse(node.isLeafNode());
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_260950b307 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isLeafNodeWithNullData() {
		SimpleTreeNode<Integer> node = new SimpleTreeNode<>(null);
		assertTrue(node.isLeafNode());
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_260950b307 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isLeafNodeInTreeStructure() {
		SimpleTreeNode<Integer> root = new SimpleTreeNode<>(1);
		SimpleTreeNode<Integer> left = new SimpleTreeNode<>(2);
		SimpleTreeNode<Integer> right = new SimpleTreeNode<>(3);
		SimpleTreeNode<Integer> leaf = new SimpleTreeNode<>(4);
		root.setLeftNode(left);
		root.setRightNode(right);
		left.setLeftNode(leaf);
		assertFalse(root.isLeafNode());
		assertFalse(left.isLeafNode());
		assertTrue(right.isLeafNode());
		assertTrue(leaf.isLeafNode());
	}

	/*
	 * ROOST_METHOD_HASH=getLeftNode_608957bc7f
	 * ROOST_METHOD_SIG_HASH=getLeftNode_951652073f
	 *
	 */void getLeftNodeWhenNull() {

		SimpleTreeNode<Integer> node = new SimpleTreeNode<>();

		SimpleTreeNode<Integer> leftNode = node.getLeftNode();

		assertNull(leftNode);
	}

	/*
	 * ROOST_METHOD_HASH=getLeftNode_608957bc7f
	 * ROOST_METHOD_SIG_HASH=getLeftNode_951652073f
	 *
	 */void getLeftNodeWhenSet() {

		SimpleTreeNode<Integer> parentNode = new SimpleTreeNode<>(1);
		SimpleTreeNode<Integer> leftChild = new SimpleTreeNode<>(2);
		parentNode.setLeftNode(leftChild);

		SimpleTreeNode<Integer> result = parentNode.getLeftNode();

		assertNotNull(result);
		assertEquals(leftChild, result);
	}

	/*
	 * ROOST_METHOD_HASH=getLeftNode_608957bc7f
	 * ROOST_METHOD_SIG_HASH=getLeftNode_951652073f
	 *
	 */void getLeftNodeAfterSettingToNull() {

		SimpleTreeNode<Integer> node = new SimpleTreeNode<>(1);
		SimpleTreeNode<Integer> leftChild = new SimpleTreeNode<>(2);
		node.setLeftNode(leftChild);
		node.setLeftNode(null);

		SimpleTreeNode<Integer> result = node.getLeftNode();

		assertNull(result);
	}

	/*
	 * ROOST_METHOD_HASH=getLeftNode_608957bc7f
	 * ROOST_METHOD_SIG_HASH=getLeftNode_951652073f
	 *
	 */void getLeftNodeWithFullTree() {

		SimpleTreeNode<Integer> leftChild = new SimpleTreeNode<>(2);
		SimpleTreeNode<Integer> rightChild = new SimpleTreeNode<>(3);
		SimpleTreeNode<Integer> parent = new SimpleTreeNode<>(1, null, leftChild, rightChild);

		SimpleTreeNode<Integer> result = parent.getLeftNode();

		assertNotNull(result);
		assertEquals(leftChild, result);
		assertEquals(2, result.getData());
	}

	/*
	 * ROOST_METHOD_HASH=getRightNode_d67163fa77
	 * ROOST_METHOD_SIG_HASH=getRightNode_f686acdf1b
	 *
	 */void getRightNodeWhenNull() {
		SimpleTreeNode<Integer> node = new SimpleTreeNode<>();
		assertNull(node.getRightNode());
	}

	/*
	 * ROOST_METHOD_HASH=getRightNode_d67163fa77
	 * ROOST_METHOD_SIG_HASH=getRightNode_f686acdf1b
	 *
	 */void getRightNodeWhenSet() {
		SimpleTreeNode<Integer> node = new SimpleTreeNode<>(1);
		SimpleTreeNode<Integer> rightNode = new SimpleTreeNode<>(2);
		node.setRightNode(rightNode);
		assertEquals(rightNode, node.getRightNode());
	}

	/*
	 * ROOST_METHOD_HASH=getRightNode_d67163fa77
	 * ROOST_METHOD_SIG_HASH=getRightNode_f686acdf1b
	 *
	 */void getRightNodeAfterConstructorWithNodes() {
		SimpleTreeNode<Integer> parent = new SimpleTreeNode<>(1);
		SimpleTreeNode<Integer> left = new SimpleTreeNode<>(2);
		SimpleTreeNode<Integer> right = new SimpleTreeNode<>(3);
		SimpleTreeNode<Integer> node = new SimpleTreeNode<>(4, parent, left, right);
		assertEquals(right, node.getRightNode());
	}

	/*
	 * ROOST_METHOD_HASH=getRightNode_d67163fa77
	 * ROOST_METHOD_SIG_HASH=getRightNode_f686acdf1b
	 *
	 */void getRightNodeAfterSettingToNull() {
		SimpleTreeNode<Integer> node = new SimpleTreeNode<>(1);
		SimpleTreeNode<Integer> rightNode = new SimpleTreeNode<>(2);
		node.setRightNode(rightNode);
		node.setRightNode(null);
		assertNull(node.getRightNode());
	}

	/*
	 * ROOST_METHOD_HASH=getRightNode_d67163fa77
	 * ROOST_METHOD_SIG_HASH=getRightNode_f686acdf1b
	 *
	 */void getRightNodeWithMultipleLevels() {
		SimpleTreeNode<Integer> root = new SimpleTreeNode<>(1);
		SimpleTreeNode<Integer> level1Right = new SimpleTreeNode<>(2);
		SimpleTreeNode<Integer> level2Right = new SimpleTreeNode<>(3);
		root.setRightNode(level1Right);
		level1Right.setRightNode(level2Right);
		assertEquals(level1Right, root.getRightNode());
		assertEquals(level2Right, root.getRightNode().getRightNode());
	}

}