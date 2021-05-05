import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


public class Longest {

	//private List<Integer> sub;
	
	//private int count = 0;

	
	//0 <= s.length <= 5 * 10^4
	/*public int lengthOfLongestSubstring(String s) {
		if (s.length() < 0 || s.length() > 5 * Math.pow(10, 4))
			throw new ArrayIndexOutOfBoundsException();
		
		if(s.length() == 0)
			return count;
		
		int j = 0;
		int [] 
		
        sub = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
        	if(!sub.contains(s.charAt(i))) {
        		sub.add(s.charAt(i));
        		
        	}
        	else {
        		sub.clear();
        		if(count < comp)
        			count = comp;
        	}
        }
        return count;
    }*/
	public int lengthOfLongestSubstring(String s) {
		List<Integer> sub;
		int count = 0;
		if (s.length() < 0 || s.length() > 5 * Math.pow(10, 4))
			throw new ArrayIndexOutOfBoundsException();
		
		if(s.length() == 0)
			return count;
		
		
		sub = new ArrayList<Integer>();
		
		while (s.length() > 0 && s != null) {
			int s3 = function(s);
			//if(s3 != s.length())
			s = s.substring(1);
			sub.add(s3);
		}
		
        Collections.sort(sub);
        count = sub.get(sub.size()-1);
        
		return count;
        
	
	}
	
	private int function(String s){
		
		List<Character> s2 = new ArrayList<>();
 		for(int i = 0; i < s.length(); i++) {
        	if(!s2.contains(s.charAt(i))) {
        		s2.add(s.charAt(i));    
        	}
        	else {
        		break;
        		
        	}
        }
 		
 		return s2.size();
	
	}
	
	
}
