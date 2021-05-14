/***
* Authority: Algorithms Made Easy (https://www.youtube.com/watch?v=rt-lJS5nlOQ&list=TLPQMTMwNTIwMjGcEnc199YuEA&index=2&ab_channel=AlgorithmsMadeEasy)
* Please check out the video for more information / explanation of this code.
* There may be subtle modifications in my code.
***/



import java.util.ArrayList;
import java.util.List;

public class Ambiguous {
	
	/*
	 * Example 1: 
	 * Input: s = "(123)" 
	 * Output: ["(1, 23)", "(1, 2.3)", "(12, 3)", "(1.2, 3)"]
	 */
	
	
	/*
	 * Example 2: 
	 * Input: s = "(00011)" 
	 * Output: ["(0.001, 1)", "(0, 0.011)"]
	 * Explanation: 0.0, 00, 0001 or 00.01 are not allowed.
	 */
	
	/*
	 * Example 3: 
	 * Input: s = "(0123)" 
	 * Output: ["(0, 123)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)", "(0, 12.3)"]
	 */

	/*
	 * Example 4: 
	 * Input: s = "(100)" 
	 * Output: [(10, 0)] 
	 * Explanation: 1.0 is not allowed.
	 */
	
	List<String> answer;
	public List<String> ambiguousCoordinates(String s) {
		answer = new ArrayList<String>();
		
		for(int i = 2; i < s.length() -1; i++) {
			//coordinates
			helper(s.substring(1, i), s.substring(i, s.length() -1));
		}
		
		return answer;
    }
	
	private void helper(String x, String y){
		List<String> dotx = putDot(x);
		List<String> doty = putDot(y);
		//1, 23
		for(String dx: dotx) {
			if(isValid(dx)) {
				for(String dy: doty) {
					if(isValid(dy))
						answer.add("(" + dx + ", " + dy + ")"); //1, 23  1, 2.3
				}
			}
		}
	}
	
	private List<String> putDot(String s){
		
		List<String> dot = new ArrayList<>();
		dot.add(s); // 1, 23
		
		// 1, 2.3
		for(int i = 1; i < s.length(); i++) {
			dot.add(s.substring(0, i) + "." + s.substring(i));
		}
		
		return dot;
	}
	
	private boolean isValid(String s) {
		if(s.contains(".")) { 
			if(s.endsWith("0")) return false; // 01.
			if(s.startsWith("0") && s.charAt(1) != '.') return false;
			return true;
		} 
		else {
			if(s.equals("0")) return true; // 0, 123
			return !s.startsWith("0"); //01, 23
		}
	}

}
