package trees;

import java.util.ArrayList;

/**
 * Represents a TrieNode from a Trie-R-Way. 
 * @author Mayra D. de Azevedo
 *
 */
public class TrieNode {

	//alphabet + '$' symbol
	private TrieNode[] digits;
	//information whether node is terminal or not
	private boolean info;
	
	/**
	 * Constructs node
	 */
	public TrieNode() {
		this.digits = new TrieNode[27];
	}
	
	/**
	 * Checks whether node is the end of the word
	 * @return True if the node is terminal, false otherwise
	 */
	public boolean isTerminal() {
		return info;
	}
	
}
