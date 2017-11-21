package trees;

/**
 * Represents a TrieNode from a Trie-R-Way. 
 * @author Mayra D. de Azevedo
 *
 */
public class TrieNode {

	//alphabet symbol
	private TrieNode[] digits;
	//information whether node is terminal or not
	private boolean info;
	
	public int valor;
	
	/**
	 * Constructs node
	 */
	public TrieNode() {
		this.digits = new TrieNode[26];
		
		for( TrieNode t : digits)
			t = null;
		
		this.info = false;
		this.valor = 0;
	}
	
	/**
	 * Checks whether node is the end of the word
	 * @return True if the node is terminal, false otherwise
	 */
	public boolean isTerminal() {
		return info;
	}
	
	/**
	 * Get node at the given position.
	 * @param index Index of the node
	 * @return Node at the index given.
	 */
	public TrieNode getNodeAt(int index) {
		return digits[index];
	}
	
	/**
	 * Set node at the given position.
	 * @param index Index of the node
	 * @param node New node.
	 */
	public void setNode(int index, TrieNode node) {
		this.digits[index] = node;
	}
	
	/**
	 * Update node info.
	 * @param info
	 */
	public void setTerminalInfo(boolean info) {
		this.info = info;
	}
	
}
