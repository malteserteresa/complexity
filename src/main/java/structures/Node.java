package structures;

public class Node<T> {

	private T value;

	private Node left;

	private Node right;

	public Node(T value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public T getValue() {
		return value;
	}

}
