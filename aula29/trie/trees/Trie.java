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

	private Pair<Integer, TrieNode> searchWord(String s, TrieNode pt) {
		// l = tamanho do maior prefixo de s que corresponde ao prefixo de alguma chave
		int l = 0;
		while( l < s.length() ) {
			System.out.println(s.charAt(l));

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
		System.out.println("insert");
		
		
		//If key already exists in the tree, there's nothing else to do
		//else
		if(!pt.isTerminal()) {
			//ate o length as chaves tem o mesmo prefixo
			//inserte chave a partir de length
			
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

}
