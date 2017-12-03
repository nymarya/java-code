package avl;

public class AVLTree {

	private AVLNode root;
	
	/**
	 * Constructor
	 */
	public AVLTree() {
		root = null;
	}
	
	/**
	 * Rotate to the right
	 * @param pt Root of the rotation
	 * @return New root
	 */
	public AVLNode rotateRight(AVLNode pt) {
		AVLNode node = pt.getLeft();
		
		pt.setLeft(node.getRight());
		node.setRight(pt);
		
		return node;
	}
	
	public boolean insert(int key, AVLNode pt) {
		if(root == null) {
			root = new AVLNode();
			root.setKey(key);
			
			return true;
		}
	}
	
	/**
	 * Rotate to the left
	 * @param pt Root of the rotation
	 * @return New root
	 */
	public AVLNode rotateLeft(AVLNode pt) {
		AVLNode node = pt.getRight();
		
		pt.setRight(node.getLeft());
		node.setLeft(pt);
		
		return node;
	}
	
	/**
	 * Realize right double rotation
	 * @param pt Root of the rotation
	 * @return New root
	 */
	public AVLNode rotateDoubleRight(AVLNode pt) {
		
		AVLNode node = rotateLeft(pt.getLeft());
		
		pt.setLeft(node);
		pt = rotateRight(pt);
		
		return pt;
	}
	
	/**
	 * Realize left double rotation
	 * @param pt Root of the rotation
	 * @return New root
	 */
	public AVLNode rotateDoubleLeft(AVLNode pt) {
		
		AVLNode node = rotateRight(pt.getRight());
		
		pt.setRight(node);
		pt = rotateLeft(pt);
		
		return pt;
	}
}
