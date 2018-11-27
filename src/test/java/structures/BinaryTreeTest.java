package structures;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import structures.Node;
import structures.TraverseTree;
import util.Helper;

public class BinaryTreeTest {

	List<Node> tree = Helper.TOOLS.createTree();
	Node<String> root = tree.get(0);

	@Test
	public void canFindRoot() {
		assertEquals("A", root.getValue());
	}

	@Test
	public void canFindLeftChild() {
		assertEquals("B", root.getLeft().getValue());
	}

	@Test
	public void canFindRightChild() {
		assertEquals("C", root.getRight().getValue());
	}

	@Test
	public void preOrder() {
		TraverseTree traverse = new TraverseTree();
		traverse.preOrder(root);
	}

}
