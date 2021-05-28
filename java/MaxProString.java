import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxProString {
	/*public int maxProduct(String[] words) {
		Map<String, String> map = new HashMap<>();
		boolean flag = true;
		
		for(int i = 0; i < words.length; i++) {
			map.put(words[i], "");
		}
		
		for(String key : map.keySet()) {
			for(int i = 0; i < words.length; i++) {
				if(key.equals(words[i]))
					continue;
				for(int j = 0; j < words[i].length() && flag == true; j++) {
					if(key.contains(Character.toString(words[i].charAt(j))))
							flag = false;
						
				}
				if(flag == true) {
					if(words[i].length() > map.get(key).length())
						map.put(key, words[i]);
				}
				flag = true;
			}
		}
		int max = 0;
		for(String key: map.keySet()) {
			if(map.get(key).equals(""))
				continue;
			int sum = key.length() * map.get(key).length();
			if(sum > max)
				max = sum;
			
		}
		
		return max;
			
	}*/
	
	  public int bitNumber(char ch) {
		    return (int)ch - (int)'a';
		  }

		    public int maxProduct(String[] words) {
		        int n = words.length;
		    int[] masks = new int[n];
		    int[] lens = new int[n];

		    int bitmask = 0;
		    for (int i = 0; i < n; ++i) {
		      bitmask = 0;
		      for (char ch : words[i].toCharArray()) {
		        // add bit number bit_number in bitmask
		        bitmask |= 1 << bitNumber(ch);
		      }
		      masks[i] = bitmask;
		      lens[i] = words[i].length();
		    }

		    int maxVal = 0;
		    for (int i = 0; i < n; ++i)
		      for (int j = i + 1; j < n; ++j)
		        if ((masks[i] & masks[j]) == 0)
		          maxVal = Math.max(maxVal, lens[i] * lens[j]);

		    return maxVal;
		  }
	
	
	
	public static void main(String[] args) {
		MaxProString max = new MaxProString();
		String[] words = {"abd"};
		int ans = max.maxProduct(words);
		System.out.println(ans);
	}

}
