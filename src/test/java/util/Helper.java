package util;

import structures.Node;

import java.util.ArrayList;
import java.util.List;

public enum Helper {

	TOOLS;

	public List<Node> createTree() {
		List<Node> values = new ArrayList<Node>();
		values.add(new Node<String>("A", new Node<String>("B", null, null), new Node<String>("C",
				new Node<String>("D", new Node<String>("E", null, null), new Node<String>("F", null, null)), new Node<String>("G", null, null))));
		return values;
	}
}
