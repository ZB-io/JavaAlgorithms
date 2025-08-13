package com.thealgorithms.sorts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import org.junit.jupiter.api;

public class TopologicalSort731Test {

	/*
	 * ROOST_METHOD_HASH=addEdge_8e8b8de481 ROOST_METHOD_SIG_HASH=addEdge_1b188644c8
	 *
	 */void addSingleVertexWithoutConnections() {
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.addEdge("A", "");
		assertEquals("A", topologicalSort.sort());
	}

	/*
	 * ROOST_METHOD_HASH=addEdge_8e8b8de481 ROOST_METHOD_SIG_HASH=addEdge_1b188644c8
	 *
	 */void addVertexWithSingleConnection() {
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.addEdge("A", "B");
		String result = topologicalSort.sort();
		assertTrue(result.indexOf("A") < result.indexOf("B"));
	}

	/*
	 * ROOST_METHOD_HASH=addEdge_8e8b8de481 ROOST_METHOD_SIG_HASH=addEdge_1b188644c8
	 *
	 */void addVertexWithMultipleConnections() {
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.addEdge("A", "B", "C", "D");
		String result = topologicalSort.sort();
		assertTrue(result.indexOf("A") < result.indexOf("B"));
		assertTrue(result.indexOf("A") < result.indexOf("C"));
		assertTrue(result.indexOf("A") < result.indexOf("D"));
	}

	/*
	 * ROOST_METHOD_HASH=addEdge_8e8b8de481 ROOST_METHOD_SIG_HASH=addEdge_1b188644c8
	 *
	 */void addVertexWithEmptyLabel() {
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.addEdge("", "A");
		String result = topologicalSort.sort();
		assertTrue(result.contains(""));
		assertTrue(result.contains("A"));
	}

	/*
	 * ROOST_METHOD_HASH=addEdge_8e8b8de481 ROOST_METHOD_SIG_HASH=addEdge_1b188644c8
	 *
	 */void addMultipleVerticesWithConnections() {
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.addEdge("A", "B", "C");
		topologicalSort.addEdge("B", "D");
		topologicalSort.addEdge("C", "D");
		String result = topologicalSort.sort();
		assertTrue(result.indexOf("A") < result.indexOf("B"));
		assertTrue(result.indexOf("A") < result.indexOf("C"));
		assertTrue(result.indexOf("B") < result.indexOf("D"));
		assertTrue(result.indexOf("C") < result.indexOf("D"));
	}

	/*
	 * ROOST_METHOD_HASH=addEdge_8e8b8de481 ROOST_METHOD_SIG_HASH=addEdge_1b188644c8
	 *
	 */void addVertexWithNullNext() {
		TopologicalSort topologicalSort = new TopologicalSort();
		assertThrows(NullPointerException.class, () -> topologicalSort.addEdge("A", (String[]) null));
	}

	/*
	 * ROOST_METHOD_HASH=addEdge_8e8b8de481 ROOST_METHOD_SIG_HASH=addEdge_1b188644c8
	 *
	 */void addSameVertexMultipleTimes() {
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.addEdge("A", "B");
		topologicalSort.addEdge("A", "C");
		String result = topologicalSort.sort();
		assertTrue(result.indexOf("A") < result.indexOf("B"));
		assertTrue(result.indexOf("A") < result.indexOf("C"));
	}

	/*
	 * ROOST_METHOD_HASH=addEdge_8e8b8de481 ROOST_METHOD_SIG_HASH=addEdge_1b188644c8
	 *
	 */void addCyclicDependencies() {
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.addEdge("A", "B");
		topologicalSort.addEdge("B", "C");
		topologicalSort.addEdge("C", "A");
		assertThrows(IllegalStateException.class, () -> topologicalSort.sort());
	}

	/*
	 * ROOST_METHOD_HASH=addEdge_8e8b8de481 ROOST_METHOD_SIG_HASH=addEdge_1b188644c8
	 *
	 */void addVertexWithEmptyNextArray() {
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.addEdge("A", new String[] {});
		assertEquals("A", topologicalSort.sort());
	}

}