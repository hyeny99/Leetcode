import java.util.ArrayList;
import java.util.List;

public class FRPattern {
	public List<String> findAndReplacePattern(String[] words, String pattern) {

		List<String> ans = new ArrayList<>();
		String intS = "";
		char c[] = pattern.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (pattern.indexOf(c[i]) != i) {
				char num = intS.charAt(pattern.indexOf(c[i]));
				intS = intS.concat(Character.toString(num));
			} else {
				intS = intS.concat(Integer.toString(i));
			}
		}

		for (String word : words) {
			if (word.length() != pattern.length())
				continue;
			else {
				String check = "";
				for (int i = 0; i < word.length(); i++) {
					if (word.indexOf(word.charAt(i)) != i) {
						char num = check.charAt(word.indexOf(word.charAt(i)));
						check = check.concat(Character.toString(num));
					}
					else {
						check = check.concat(Integer.toString(i));
					}
				}
				if(check.equals(intS))
					ans.add(word);
					
			}
		}
	return ans;
	}
}
