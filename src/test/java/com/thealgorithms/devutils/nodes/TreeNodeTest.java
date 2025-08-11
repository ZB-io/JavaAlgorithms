package com.thealgorithms.devutils.nodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;

public class TreeNodeTest {

	/*
	 * ROOST_METHOD_HASH=isLeafNode_17e9033e31 ROOST_METHOD_SIG_HASH=isLeafNode_17e9033e31
	 *
	 */void setUp() {
		rootNode = new TestTreeNode<>();
		parentNode = new TestTreeNode<>(1);
		childNode = new TestTreeNode<>(2);
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_17e9033e31 ROOST_METHOD_SIG_HASH=isLeafNode_17e9033e31
	 *
	 */void verifyLeafNodeStatusForRootNode() {
		assertTrue(rootNode.isLeafNode());
		assertEquals(0, rootNode.getDepth());
		assertTrue(rootNode.isRootNode());
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_17e9033e31 ROOST_METHOD_SIG_HASH=isLeafNode_17e9033e31
	 *
	 */void verifyLeafNodeStatusForInternalNode() {
		childNode.setParent(parentNode);
		assertTrue(childNode.isLeafNode());
		assertEquals(1, childNode.getDepth());
		assertFalse(childNode.isRootNode());
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_17e9033e31 ROOST_METHOD_SIG_HASH=isLeafNode_17e9033e31
	 *
	 */void verifyLeafNodeStatusAfterParentChange() {
		TestTreeNode<Integer> initialParent = new TestTreeNode<>(3);
		TestTreeNode<Integer> newParent = new TestTreeNode<>(4);
		childNode.setParent(initialParent);
		assertEquals(initialParent, childNode.getParent());
		childNode.setParent(newParent);
		assertEquals(newParent, childNode.getParent());
		assertTrue(childNode.isLeafNode());
	}

	/*
	 * ROOST_METHOD_HASH=isLeafNode_17e9033e31 ROOST_METHOD_SIG_HASH=isLeafNode_17e9033e31
	 *
	 */void verifyLeafNodeStatusAtDifferentDepths() {
		TestTreeNode<Integer> level1 = new TestTreeNode<>(1);
		TestTreeNode<Integer> level2 = new TestTreeNode<>(2);
		TestTreeNode<Integer> level3 = new TestTreeNode<>(3);
		level2.setParent(level1);
		level3.setParent(level2);
		assertEquals(0, level1.getDepth());
		assertEquals(1, level2.getDepth());
		assertEquals(2, level3.getDepth());
		assertTrue(level1.isLeafNode());
		assertTrue(level2.isLeafNode());
		assertTrue(level3.isLeafNode());
	}

	/*
	 * ROOST_METHOD_HASH=isRootNode_fb62e4b0d9 ROOST_METHOD_SIG_HASH=isRootNode_319538feb2
	 *
	 */void setUp() {
		rootNode = new TreeNode<String>("root") {

			@Override
			public boolean isLeafNode() {
				return false;
			}
		};
		childNode = new TreeNode<String>("child") {

			@Override
			public boolean isLeafNode() {
				return false;
			}
		};
		grandChildNode = new TreeNode<String>("grandchild") {

			@Override
			public boolean isLeafNode() {
				return false;
			}
		};
	}

	/*
	 * ROOST_METHOD_HASH=isRootNode_fb62e4b0d9 ROOST_METHOD_SIG_HASH=isRootNode_319538feb2
	 *
	 */void verifyNodeIsRootWhenParentNull() {
		assertTrue(rootNode.isRootNode(), "Node with null parent should be identified as root");
	}

	/*
	 * ROOST_METHOD_HASH=isRootNode_fb62e4b0d9 ROOST_METHOD_SIG_HASH=isRootNode_319538feb2
	 *
	 */void verifyNodeIsNotRootWhenParentExists() {
		childNode.setParent(rootNode);
		assertFalse(childNode.isRootNode(), "Node with parent should not be identified as root");
	}

	/*
	 * ROOST_METHOD_HASH=isRootNode_fb62e4b0d9 ROOST_METHOD_SIG_HASH=isRootNode_319538feb2
	 *
	 */void verifyRootStatusAfterParentReassignment() {

		childNode.setParent(rootNode);
		assertFalse(childNode.isRootNode(), "Node should not be root initially");

		childNode.setParent(null);
		assertTrue(childNode.isRootNode(), "Node should be root after parent removal");
	}

	/*
	 * ROOST_METHOD_HASH=isRootNode_fb62e4b0d9 ROOST_METHOD_SIG_HASH=isRootNode_319538feb2
	 *
	 */void verifyMultipleNodesRootStatus() {
		childNode.setParent(rootNode);
		grandChildNode.setParent(childNode);
		assertTrue(rootNode.isRootNode(), "Top level node should be root");
		assertFalse(childNode.isRootNode(), "Child node should not be root");
		assertFalse(grandChildNode.isRootNode(), "Grandchild node should not be root");
	}

	/*
	 * ROOST_METHOD_HASH=getParent_6f5ddede81 ROOST_METHOD_SIG_HASH=getParent_253cd7465a
	 *
	 */void setUp() {
		rootNode = new TreeNode<Integer>(10) {

			@Override
			public boolean isLeafNode() {
				return true;
			}
		};
		childNode = new TreeNode<Integer>(20, rootNode) {

			@Override
			public boolean isLeafNode() {
				return true;
			}
		};
	}

	/*
	 * ROOST_METHOD_HASH=getParent_6f5ddede81 ROOST_METHOD_SIG_HASH=getParent_253cd7465a
	 *
	 */void getParentForRootNode() {
		assertNull(rootNode.getParent());
		assertTrue(rootNode.isRootNode());
	}

	/*
	 * ROOST_METHOD_HASH=getParent_6f5ddede81 ROOST_METHOD_SIG_HASH=getParent_253cd7465a
	 *
	 */void getParentForChildNode() {
		assertEquals(rootNode, childNode.getParent());
		assertFalse(childNode.isRootNode());
	}

	/*
	 * ROOST_METHOD_HASH=getParent_6f5ddede81 ROOST_METHOD_SIG_HASH=getParent_253cd7465a
	 *
	 */void getParentAfterSettingParent() {
		TreeNode<Integer> newNode = new TreeNode<Integer>(30) {

			@Override
			public boolean isLeafNode() {
				return true;
			}
		};
		newNode.setParent(rootNode);
		assertEquals(rootNode, newNode.getParent());
		assertEquals(rootNode.getDepth() + 1, newNode.getDepth());
	}

	/*
	 * ROOST_METHOD_HASH=getParent_6f5ddede81 ROOST_METHOD_SIG_HASH=getParent_253cd7465a
	 *
	 */void getParentForNewlyCreatedNode() {
		TreeNode<Integer> newNode = new TreeNode<Integer>() {

			@Override
			public boolean isLeafNode() {
				return true;
			}
		};
		assertNull(newNode.getParent());
		assertEquals(0, newNode.getDepth());
	}

	/*
	 * ROOST_METHOD_HASH=setParent_225779d436 ROOST_METHOD_SIG_HASH=setParent_8e90711f58
	 *
	 */void setUp() {
		parentNode = new TreeNode<String>("parent") {

			@Override
			public boolean isLeafNode() {
				return false;
			}
		};
		childNode = new TreeNode<String>("child") {

			@Override
			public boolean isLeafNode() {
				return true;
			}
		};
	}

	/*
	 * ROOST_METHOD_HASH=setParent_225779d436 ROOST_METHOD_SIG_HASH=setParent_8e90711f58
	 *
	 */void setParentForNewChildNode() {

		parentNode = new TreeNode<String>("parent") {

			private int depth = 2;

			@Override
			public boolean isLeafNode() {
				return false;
			}

			@Override
			public int getDepth() {
				return depth;
			}
		};

		childNode.setParent(parentNode);

		assertEquals(parentNode, childNode.getParent());
		assertEquals(3, childNode.getDepth());
	}

	/*
	 * ROOST_METHOD_HASH=setParent_225779d436 ROOST_METHOD_SIG_HASH=setParent_8e90711f58
	 *
	 */void setParentForRootNode() {

		childNode.setParent(null);

		assertNull(childNode.getParent());
		assertEquals(0, childNode.getDepth());
	}

	/*
	 * ROOST_METHOD_HASH=setParent_225779d436 ROOST_METHOD_SIG_HASH=setParent_8e90711f58
	 *
	 */void setParentForMultipleLevels() {

		TreeNode<String> grandParent = new TreeNode<String>("grandparent") {

			@Override
			public boolean isLeafNode() {
				return false;
			}
		};

		parentNode.setParent(grandParent);
		childNode.setParent(parentNode);

		assertEquals(parentNode, childNode.getParent());
		assertEquals(2, childNode.getDepth());
		assertEquals(grandParent, parentNode.getParent());
		assertEquals(1, parentNode.getDepth());
	}

	/*
	 * ROOST_METHOD_HASH=setParent_225779d436 ROOST_METHOD_SIG_HASH=setParent_8e90711f58
	 *
	 */void setParentUpdatesDepthCorrectly() {

		TreeNode<String> node1 = new TreeNode<String>("node1") {

			@Override
			public boolean isLeafNode() {
				return false;
			}
		};
		TreeNode<String> node2 = new TreeNode<String>("node2") {

			@Override
			public boolean isLeafNode() {
				return true;
			}
		};

		node2.setParent(node1);
		node1.setParent(parentNode);

		assertEquals(2, node2.getDepth());
		assertEquals(1, node1.getDepth());
	}

	/*
	 * ROOST_METHOD_HASH=getDepth_8579c88251 ROOST_METHOD_SIG_HASH=getDepth_772d253852
	 *
	 */void getDepthForRootNode() {
		TreeNode<Integer> root = new TreeNode<>(1);
		assertEquals(0, root.getDepth());
	}

	/*
	 * ROOST_METHOD_HASH=getDepth_8579c88251 ROOST_METHOD_SIG_HASH=getDepth_772d253852
	 *
	 */void getDepthForDirectChild() {
		TreeNode<Integer> root = new TreeNode<>(1);
		TreeNode<Integer> child = new TreeNode<>(2);
		child.setParent(root);
		assertEquals(1, child.getDepth());
	}

	/*
	 * ROOST_METHOD_HASH=getDepth_8579c88251 ROOST_METHOD_SIG_HASH=getDepth_772d253852
	 *
	 */void getDepthForNestedNode() {
		TreeNode<Integer> root = new TreeNode<>(1);
		TreeNode<Integer> firstChild = new TreeNode<>(2);
		TreeNode<Integer> secondChild = new TreeNode<>(3);
		firstChild.setParent(root);
		secondChild.setParent(firstChild);
		assertEquals(2, secondChild.getDepth());
	}

	/*
	 * ROOST_METHOD_HASH=getDepth_8579c88251 ROOST_METHOD_SIG_HASH=getDepth_772d253852
	 *
	 */void getDepthAfterParentReassignment() {
		TreeNode<Integer> root = new TreeNode<>(1);
		TreeNode<Integer> firstChild = new TreeNode<>(2);
		TreeNode<Integer> otherFirstChild = new TreeNode<>(3);
		TreeNode<Integer> secondChild = new TreeNode<>(4);
		firstChild.setParent(root);
		otherFirstChild.setParent(root);
		secondChild.setParent(firstChild);
		assertEquals(2, secondChild.getDepth());

		secondChild.setParent(otherFirstChild);
		assertEquals(2, secondChild.getDepth());
	}

}