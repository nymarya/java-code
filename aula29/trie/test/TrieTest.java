package test;

import static org.junit.Assert.*;

import org.junit.Test;

import trees.Trie;

public class TrieTest {

	@Test
	public void test() {
		Trie trie = new Trie();
		boolean result = trie.search("salut");
		assertEquals(false, result);
		
		trie.insertWord("salut");
		result = trie.search("salut");
		
		assertEquals(true, result);
		
		trie.insertWord("formidable");
		trie.insertWord("super");
		
		
		result = trie.search("formidable");
		assertEquals(true, result);
		result = trie.search("super");
		assertEquals(true, result);
		result = trie.search("form");
		assertEquals(false, result);
		
		trie.insertWord("superhero");
		result = trie.search("superhero");
		assertEquals(true, result);
		
		trie.remove("super");
		result = trie.search("formidable");
		assertEquals(true, result);
		result = trie.search("super");
		assertEquals(false, result);
		
		
	}

}
