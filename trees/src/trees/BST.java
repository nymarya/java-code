package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/**
 * Represent a binary search tree.
 * @author mayra
 *
 */
public class BST {

	private Node root;
	
	/**
	 * Construct BST from array.
	 */
	public BST (List<Integer> array) {
		this.setRoot(null);
		Collections.sort(array);
		insertFromArray(array, 0, array.size()-1);
	}

	/**
	 * Construct object for class BST
	 */
	public BST() {
		this.setRoot(null);
	}
	
	/**
	 * Insert elements from array in the BST
	 * @param array
	 * @param first
	 * @param last
	 */
	private void insertFromArray(List<Integer> array, int first, int last) {
		if(first != last) {
			int mid = (first+last)/2;
			insert(array.get(mid), 0);
			insertFromArray(array, first, mid);
			insertFromArray(array, mid+1, last);
		}
	}
	
	/**
	 * Inserts new node in the tree.
	 * @param key
	 * @param content
	 */
	public void insert(int key, int content) {
		
		//check where to insert the new node
		int [] f = {0};
		Node pt = search(key, f);
		
		if( f[0] == 1) {
			//node already exists, insert failed
			return;
		}
		
		Node node_ = new Node(key, content, null, null, 0);
		
		if( root == null) {
			root = node_;
			return;
		}

		if(f[0] == 2 ) {
			//pt has an empty left child
			pt.setLeft(node_);
		} else if (f[0]==3){
			//pt has an empty right child
			pt.setRight(node_);
		}
		
	}
	
	/**
	 * Search key in the tree.
	 * @param key Key to be searched
	 * @param f Variable that keeps information about the search result.	
	 * 			If f=0, the tree is empty. 			
	 * 			If f=1, the key was found and 'pt' points to the node where the key is.         
	 * 			If f=2, the key wasn't found and 'pt' points to the node without 
	 * 					the left child.
	 * 			If f=3, the key wasn't found and 'pt' points to the node without 	         
	 * 					the right child. 	
	 */
	public Node search(int key, int[] f) {
		Node rt = root;
	
		//if tree is not empty
		if( rt != null) {
			while(f[0] == 0) {
				//if key was found
				if( rt.getKey() == key ) {
					f[0] = 1;
				} else if( rt.getKey() > key ) {	
					//key wasn't found, look at left subtree

					if( rt.getLeft() != null) 
						rt = rt.getLeft();
					else 
						f[0] = 2;
				} else {
					//look at right subtree

					if(rt.getRight() != null)
						rt = rt.getRight();
					else
						f[0] = 3;
				}
			}
		}
		
		return rt;
	}

	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}
	
	/**
	 * Traverse the bst
	 */
	public void levelTraversal() {
		Deque<Node> nodes = new ArrayDeque<Node>();
		
		nodes.addLast(root);
		
		while( !nodes.isEmpty() ) {
			Node nd = nodes.removeFirst();

			System.out.println(nd.getKey());
			
			if(nd.getLeft() != null)
				nodes.addLast(nd.getLeft());
			
			if(nd.getRight() != null)
				nodes.addLast(nd.getRight());
			
		}
	}
	
	public void visit( Node node) {
		
	}
	
	/**
	 * Traverse in preorder
	 */
	public void preOrderTraversal() {
		Stack<Node> nodes = new Stack<Node>();
		
		nodes.push(root);
		
		while( !nodes.empty() ) {
			Node node = nodes.pop();
			
			visit(node);
			
			if(node.getRight() != null) {
				nodes.push(node.getRight());
			}
			
			if(node.getLeft() != null ) {
				nodes.push(node.getLeft());
			}
		}
	}
	
	public void calculateHeight( Node node) {
		
		if(node.getLeft() != null)
			calculateHeight(node.getLeft());
		
		if(node.getRight() != null)
			calculateHeight(node.getRight());
		
		getHeight(node);
	}
	
	private void getHeight(Node node) {
		int altL = 1;
		int altR = 1;
		
		if(node.getLeft() != null)
			altL += node.getLeft().getHeight();
		
		if(node.getRight() != null)
			altR += node.getRight().getHeight();
		
		int height = (altL > altR) ? altL : altR;
		node.setHeight(height);
	}
	
}