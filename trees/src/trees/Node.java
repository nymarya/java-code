package trees;

/**
 * Represent a node from a tree;
 * @author mayra
 *
 */
public class Node {

	private int key;
	private int content;
	private Node left;
	private Node right;
	private int height;
	
	/**
	 * Construct object for class Node
	 * @param key Key of the node.
	 * @param content Content of the node.
	 * @param left Left of the node.
	 * @param right Right of the node.
	 * @param height Height of the node.
	 */
	public Node(int key, int content, Node left, Node right, int height) {
		this.key = key;
		this.content = content;
		this.left = left;
		this.right = right;
		this.height = height;
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * @return the content
	 */
	public int getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(int content) {
		this.content = content;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
