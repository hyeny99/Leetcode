
public class Delete4Two {
	public int minDistance(String word1, String word2) {
		// Find the longest substring in both word1 and word2

		// eta sae = (length of word1 + word2) - 2 * 1
		// array of found letters: e 1
		// array of found letters: a 1

		// etco leetcode = 8 + 4 - 2 * 4 = 4
		// array of found letters: etco = 4

		// yoyo mayonesse
		// array of foujnd letters: yo

		// yo/game gameyotest 6
		// array of found letters: yo 2
		// array of found letters: game 4

		// word1 has the shorter length than word2
		/*if (word1.length() > word2.length()) {
			String temp = word1;
			word1 = word2;
			word2 = temp;
		}

		int i = 0;
		int j = 0;

		int counter = 0;
		int comp = 0;
		String sub = "";

		while (i < word1.length()) {
			int index = word2.indexOf(word1.charAt(i));
			sub = word2;

			while (index != -1 && sub.length() > 0 && i < word1.length()) {
				index = sub.indexOf(word1.charAt(i));

				
				sub = sub.substring(index + 1);
				counter++;
			
				i++;

			}

			if (comp < counter) {
				comp = counter;
			}

			if (comp > 0)
				i = comp + j;

			else {
				i++;
				j++;
			}

			j += counter;
			counter = 0;

		}*/

		//return comp;
		// return (word1.length() + word2.length()) - 2 * comp;
		
		int[][] table = new int[word1.length() + 1][word2.length() + 1];
		
		for(int i = 0; i <= word1.length(); i++) {
			for(int j = 0; j <= word2.length(); j++) {
				if(i == 0 || j == 0) {
					table[i][j] = i + j;
				}
				
				// no need to delete a character
				else if(word1.charAt(i-1) == word2.charAt(j-1)) {
					table[i][j] = table[i-1][j-1];
				}
				
				//delete one character
				else {
					table[i][j] = 1 + Math.min(table[i][j-1], table[i-1][j]);
				}
			}
		}
		
		/*int od[] = new int[word2.length() + 1];
		
		for(int i = 0; i <= word1.length(); i++) {
			for(int j = 0; j <= word2.length(); j++) {
				if(i == 0 || j == 0)
					od[j] = i + j;
				
				else if(word1.charAt(i-1) == word2.charAt(j-1)) {
					od[j] = 
				}
			}
		}*/

		return table[word1.length()][word2.length()];
	}

}
