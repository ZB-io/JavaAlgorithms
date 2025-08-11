package com.thealgorithms.devutils.nodes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api;

public class NodeTest {

	/*
	 * ROOST_METHOD_HASH=getData_54cc99a6b0 ROOST_METHOD_SIG_HASH=getData_c36e72e3d5
	 *
	 */void getDataWithValidContent() {

		Node<String> node = new Node<>();
		node.setData("test data");

		String result = node.getData();

		assertEquals("test data", result);
	}

	/*
	 * ROOST_METHOD_HASH=getData_54cc99a6b0 ROOST_METHOD_SIG_HASH=getData_c36e72e3d5
	 *
	 */void getDataWithNullContent() {

		Node<String> node = new Node<>();

		String result = node.getData();

		assertNull(result);
	}

	/*
	 * ROOST_METHOD_HASH=getData_54cc99a6b0 ROOST_METHOD_SIG_HASH=getData_c36e72e3d5
	 *
	 */void getDataAfterMultipleUpdates() {

		Node<Integer> node = new Node<>();
		node.setData(1);
		node.setData(2);
		node.setData(3);

		Integer result = node.getData();

		assertEquals(3, result);
	}

	/*
	 * ROOST_METHOD_HASH=getData_54cc99a6b0 ROOST_METHOD_SIG_HASH=getData_c36e72e3d5
	 *
	 */void getDataWithParameterizedConstructor() {

		Node<Double> node = new Node<>(3.14);

		Double result = node.getData();

		assertEquals(3.14, result);
	}

	/*
	 * ROOST_METHOD_HASH=getData_54cc99a6b0 ROOST_METHOD_SIG_HASH=getData_c36e72e3d5
	 *
	 */void getDataAfterSettingNull() {

		Node<String> node = new Node<>("initial");
		node.setData(null);

		String result = node.getData();

		assertNull(result);
	}

}