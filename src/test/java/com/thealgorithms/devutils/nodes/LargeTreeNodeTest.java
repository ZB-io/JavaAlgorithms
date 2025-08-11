package com.thealgorithms.devutils.nodes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api;

public class LargeTreeNodeTest {

	/*
	 * ROOST_METHOD_HASH=isLeafNode_8d876277a2 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isLeafNodeWhenChildNodesNull() {

		LargeTreeNode<String> node = new LargeTreeNode<>("test");
		node.setChildNodes(null);

		boolean result = node.isLeafNode();

		assertTrue(result);
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_8d876277a2 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isLeafNodeWhenChildNodesEmpty() {

		LargeTreeNode<Integer> node = new LargeTreeNode<>(1);
		node.setChildNodes(new ArrayList<>());

		boolean result = node.isLeafNode();

		assertTrue(result);
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_8d876277a2 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isNotLeafNodeWhenHasChildren() {

		LargeTreeNode<String> parentNode = new LargeTreeNode<>("parent");
		Collection<LargeTreeNode<String>> children = new ArrayList<>();
		children.add(new LargeTreeNode<>("child1"));
		children.add(new LargeTreeNode<>("child2"));
		parentNode.setChildNodes(children);

		boolean result = parentNode.isLeafNode();

		assertFalse(result);
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_8d876277a2 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isLeafNodeWithSingleNullChild() {

		LargeTreeNode<Integer> node = new LargeTreeNode<>(1);
		Collection<LargeTreeNode<Integer>> children = new ArrayList<>();
		children.add(null);
		node.setChildNodes(children);

		boolean result = node.isLeafNode();

		assertFalse(result);
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_8d876277a2 ROOST_METHOD_SIG_HASH=isLeafNode_f6598a7472
	 *
	 */void isLeafNodeAfterRemovingAllChildren() {

		LargeTreeNode<String> node = new LargeTreeNode<>("test");
		Collection<LargeTreeNode<String>> children = new ArrayList<>();
		children.add(new LargeTreeNode<>("child"));
		node.setChildNodes(children);

		node.setChildNodes(new ArrayList<>());
		boolean result = node.isLeafNode();

		assertTrue(result);
	}

	/*
	 * ROOST_METHOD_HASH=getChildNodes_169e3f1364
	 * ROOST_METHOD_SIG_HASH=getChildNodes_90012bfa02
	 *
	 */void getChildNodesWhenNodeHasNoChildren() {

		LargeTreeNode<String> node = new LargeTreeNode<>();

		Collection<LargeTreeNode<String>> childNodes = node.getChildNodes();

		assertNull(childNodes);
	}

	/*
	 * ROOST_METHOD_HASH=getChildNodes_169e3f1364
	 * ROOST_METHOD_SIG_HASH=getChildNodes_90012bfa02
	 *
	 */void getChildNodesWhenNodeHasChildren() {

		Collection<LargeTreeNode<String>> children = new ArrayList<>();
		children.add(new LargeTreeNode<>("Child1"));
		children.add(new LargeTreeNode<>("Child2"));
		LargeTreeNode<String> node = new LargeTreeNode<>("Parent", null, children);

		Collection<LargeTreeNode<String>> result = node.getChildNodes();

		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.containsAll(children));
	}

	/*
	 * ROOST_METHOD_HASH=getChildNodes_169e3f1364
	 * ROOST_METHOD_SIG_HASH=getChildNodes_90012bfa02
	 *
	 */void getChildNodesWhenNodeHasSingleChild() {

		Collection<LargeTreeNode<String>> children = new ArrayList<>();
		children.add(new LargeTreeNode<>("OnlyChild"));
		LargeTreeNode<String> node = new LargeTreeNode<>("Parent", null, children);

		Collection<LargeTreeNode<String>> result = node.getChildNodes();

		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.containsAll(children));
	}

	/*
	 * ROOST_METHOD_HASH=getChildNodes_169e3f1364
	 * ROOST_METHOD_SIG_HASH=getChildNodes_90012bfa02
	 *
	 */void getChildNodesAfterSettingChildren() {

		LargeTreeNode<String> node = new LargeTreeNode<>();
		Collection<LargeTreeNode<String>> children = new ArrayList<>();
		children.add(new LargeTreeNode<>("Child1"));
		node.setChildNodes(children);

		Collection<LargeTreeNode<String>> result = node.getChildNodes();

		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals(children, result);
	}

	/*
	 * ROOST_METHOD_HASH=getChildNodes_169e3f1364
	 * ROOST_METHOD_SIG_HASH=getChildNodes_90012bfa02
	 *
	 */void getChildNodesWithEmptyChildrenCollection() {

		LargeTreeNode<String> node = new LargeTreeNode<>();
		node.setChildNodes(new ArrayList<>());

		Collection<LargeTreeNode<String>> result = node.getChildNodes();

		assertNotNull(result);
		assertTrue(result.isEmpty());
	}

}