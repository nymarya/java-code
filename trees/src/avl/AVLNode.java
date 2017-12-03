package avl;

public class AVLNode {

	private AVLNode left;
	private AVLNode right;
	
	private int key;
	
	private int bal;
	private int height;
	
	public AVLNode() {
		left = null;
		right = null;
		bal = 0;
		height = 0;
	}
	
	/**
	 * @return the left
	 */
	public AVLNode getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(AVLNode left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public AVLNode getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(AVLNode right) {
		this.right = right;
	}
	/**
	 * @return the bal
	 */
	public int getBal() {
		return bal;
	}
	/**
	 * @param bal the bal to set
	 */
	public void setBal(int bal) {
		this.bal = bal;
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
	
	
	
}
