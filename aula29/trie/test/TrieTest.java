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
	}

}
