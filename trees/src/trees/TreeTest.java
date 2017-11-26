package trees;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TreeTest {

	@Test
	public void test() {
		BST bst = new BST();
		bst.insert(50, 50);
		bst.insert(35, 35);
		bst.insert(70, 70);
		bst.insert(25, 25);
		bst.insert(65, 65);
		bst.insert(90, 90);
		bst.insert(40, 40);
		bst.insert(80, 80);
		bst.insert(30, 30);
		
		bst.levelTraversal();
		
		
		int [] f = {0};
		Node node = bst.search(50, f);
		bst.calculateHeight(node);
		assertEquals(node.getLeft().getKey(), 35);
		assertEquals(node.getRight().getKey(), 70);
		assertEquals(4, node.getHeight());
		
		f[0] = 0;
		node = bst.search(35, f);
		assertEquals(node.getLeft().getKey(), 25);
		assertEquals(node.getRight().getKey(), 40);
		assertEquals(3, node.getHeight());
		
		f[0] = 0;
		node = bst.search(25, f);
		assertEquals(null, node.getLeft());
		assertEquals(30, node.getRight().getKey());
		assertEquals(2, node.getHeight());
		
		f[0] = 0;
		node = bst.search(70, f);
		assertEquals(node.getLeft().getKey(), 65);
		assertEquals(node.getRight().getKey(), 90);
		assertEquals(3, node.getHeight());
		
		f[0] = 0;
		node = bst.search(40, f);
		assertEquals(node.getLeft(), null);
		assertEquals(node.getRight(), null);
		assertEquals(1, node.getHeight());
		
		f[0] = 0;
		node = bst.search(65, f);
		assertEquals(null, node.getLeft());
		assertEquals(null, node.getRight());
		assertEquals(1, node.getHeight());
		
		f[0] = 0;
		node = bst.search(90, f);
		assertEquals(80, node.getLeft().getKey());
		assertEquals(null, node.getRight());
		assertEquals(2, node.getHeight());
		
		f[0] = 0;
		node = bst.search(80, f);
		assertEquals(null, node.getLeft());
		assertEquals(null, node.getRight());
		assertEquals(1, node.getHeight());
		
		f[0] = 0;
		node = bst.getPredecessor( bst.search(50, f) );
		assertEquals( 40, node.getKey());
		
		f[0] = 0;
		node = bst.getSucessor( bst.search(50, f) );
		assertEquals( 65, node.getKey());
		
		f[0] = 0;
		node = bst.search(30, f);
		assertEquals(1, f[0]);
		
		//test removing leaf node
		bst.remove(40);
		
		f[0] = 0;
		node = bst.search(40, f);
		assertNotEquals(1, f[0]);
		
		//test removing node with only one child
		bst.remove(35);
		
		f[0] = 0;
		node = bst.search(35, f);
		assertNotEquals(1, f[0]);
		
		f[0] = 0;
		node = bst.search(25, f);
		assertEquals(1, f[0]);
		
		//test removing node with both children
		bst.remove(70);
		
		f[0] = 0;
		node = bst.search(70, f);
		assertNotEquals(1, f[0]);
		
		f[0] = 0;
		node = bst.search(80, f);
		assertEquals(1, f[0]);
	}
	
	@Test
	public void testeA() {
		ArrayList<Integer> els = new ArrayList<Integer>();
		for(int i = 0; i < 30 ; i++) {
			els.add(i);
		}
				
		BST nBST = new BST(els);
		Node n = nBST.getRoot();
		nBST.calculateHeight(n);
		assertEquals(5, n.getHeight());
	}

}
