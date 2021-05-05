import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WordFilter {

	Trie prefix = null;
	Trie suffix = null;

	public WordFilter(String[] words) {
		prefix = new Trie();
		suffix = new Trie();
		
		for(int i = 0; i < words.length; i++) {
			prefix.insert(words[i], i);
			suffix.insert(new StringBuilder(words[i]).reverse().toString(), i);
		}
		
				
	    }

	/***
	 * 1 <= words.length <= 15000
	   1 <= words[i].length <= 10
1 <= prefix.length, suffix.length <= 10
words[i], prefix and suffix consist of lower-case English letters only.
At most 15000 calls will be made to the function f.
	 * 
	 */
	public int f(String pre, String suff) {
		List<Integer> p = prefix.startsWith(pre);		
		List<Integer> q = suffix.startsWith(new StringBuilder(suff).reverse().toString());
		
		int i = p.size() - 1;
		int j = q.size() - 1;
		
		while(i >= 0 && j >= 0) {
			if(Objects.equals(p.get(i), q.get(j)))
				return p.get(i);
			else if(p.get(i) > q.get(j))
			 	i--;
			else
				j--;
		}
		return -1;
		
	}
}

 class Trie{
	public Trie[] t;
	List<Integer> index;
	
	Trie(){
		t = new Trie[26]; //lowercase letter 26
		index = new ArrayList<>();
	}
	
	//insert
	public void insert(String word, int i) {
		Trie root = this; //this = new Trie();
		
		for(char c : word.toCharArray()) {
			if(root.t[c - 'a'] == null)
				root.t[c - 'a'] = new Trie();
			
			root = root.t[c - 'a'];		
			root.index.add(i);
		}
		
		
	}
	
	//startswith
	
	public List<Integer> startsWith(String prefix) {
		Trie root = this;
		for(char c : prefix.toCharArray()) {
			if(root.t[c - 'a'] == null)
				return new ArrayList<>();
			
			root = root.t[c - 'a'];
		}
		
	    return root.index;
	}
}

/**
 * Your WordFilter object will be instantiated and called as such: WordFilter
 * obj = new WordFilter(words); int param_1 = obj.f(prefix,suffix);
 */
