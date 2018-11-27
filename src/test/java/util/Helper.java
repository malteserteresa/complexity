package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import structures.Node;

public enum Helper {

	TOOLS;
	// TODO add timer, array generator, graphing tool, iterator?

	public int[] generateListToSort(int length) {
		int[] list = new int[length];
		Random rand = new Random();
		int n = 0;

		while (n < length) {
			list[n] = rand.nextInt(100);
			n++;
		}
		return list;
	}

	public List<Node> createTree() {
		List<Node> values = new ArrayList<Node>();
		values.add(new Node<String>("A", new Node<String>("B", null, null), new Node<String>("C",
				new Node<String>("D", new Node<String>("E", null, null), new Node<String>("F", null, null)), new Node<String>("G", null, null))));
		return values;
	}
}
