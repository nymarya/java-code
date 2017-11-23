package trees;

/**
 * Represents a Trie-R-Way tree.
 * @author Mayra D. de Azevedo
 *
 */
public class Trie {

	private TrieNode root;

	/**
	 * Constructs Trie tree.
	 */
	public Trie() {
		this.root = new TrieNode();
	}

	/**
	 * Search key at the tree.
	 * @param s The key to be searched
	 * @param pt The current pointer.
	 * @return Length of the prefix and a pointer to the node
	 * that corresponds to the longest prefix that matches with the key.
	 * 
	 */
	private Pair<Integer, TrieNode> searchWord(String s, TrieNode pt) {
		// l = length of the longest prefix in common with some key
		int l = 0;
		while( l < s.length() ) {

			//get character position at the alphabet
			int index = s.charAt(l) - 94;
			if( pt.getNodeAt(index) != null) {
				//keep checking the nodes
				pt = pt.getNodeAt(index);
				l++;
			} else {
				//Stop the loop when there is no matching digit anymore
				break;
			}

		}

		Pair<Integer, TrieNode> pair = new Pair<Integer,TrieNode>(l, pt);

		return pair;
	}

	/**
	 * Inserts word at the tree.
	 * @param s Word to be inserted.
	 */
	public void insertWord( String s) {
		//Use auxiliar method
		TrieNode pt = root;
		Pair<Integer, TrieNode> result = searchWord(s, pt);
		int length = result.getFirst();
		pt = result.getSecond();


		//insert key from length to end of string
		while(length < s.length()) {
			//allocate new Node
			TrieNode node = new TrieNode();

			//get character position at the alphabet
			int index = s.charAt(length) - 94;
			pt.setNode(index, node);

			//Skip to the next node
			pt = pt.getNodeAt(index);
			length++;
		}

		//Set last node as terminal
		pt.setTerminalInfo(true);

	}

	/**
	 * Search string in the tree.
	 * @param s String to be searched
	 * @return True if string was found, false otherwise.
	 */
	public boolean search(String s) {

		//Use auxiliary method
		TrieNode pointer = root;
		Pair<Integer, TrieNode> result = searchWord(s, pointer);

		pointer = result.getSecond();

		//Check if the remaining pointer is end of word
		if(pointer.isTerminal())
			return true;

		return false;
	}

	/**
	 * 
	 * @param s
	 */
	public void remove(String s) {
		//Use helper method
		root = removeHelper(s, root, 0);
	}

	/**
	 * 
	 * @param s
	 * @param pt
	 * @param l
	 * @return
	 */
	private TrieNode removeHelper(String s, TrieNode pt, int l) {
		//Base case 1 = null pt
		if(pt == null)
			return null;

		//Base case 2: key is prefix to another key
		if(l == s.length() && pt.isTerminal() )
			pt.setTerminalInfo(false);

		if(l < s.length() ) {
			//Recursive calls
			int index = s.charAt(l) - 94;
			TrieNode aux = pt.getNodeAt(index);
			pt.setNode(index, removeHelper(s, aux, l+1));
		}
		//if pt is terminal
		if(pt.isTerminal())
			return pt;

		//check if pt is leaf
		for(int i = 0; i < 26; i++)
			if(pt.getNodeAt(i) != null) return pt;

		return null;
	}

}
