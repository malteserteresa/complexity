package structures;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;


public class TraverseTree {

	public void preOrder(Node root) {
		if (root == null) {
			System.out.println("finished");
		}

		Queue<Node<String>> queue = new ArrayDeque<Node<String>>();
		queue.add(root);
		System.out.println(root.getValue());

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.getValue());

			if (node.getLeft() != null) {
				queue.add(node.getLeft());
			}

			if (node.getRight() != null) {
				queue.add(node.getRight());
			}

		}

	}

	public TraverseTree() {
	}

}
