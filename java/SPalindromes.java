

public class SPalindromes {
	
	/*
	 *  Input: left = "4", right = "1000"
		Output: 4
		Explanation: 4, 9, 121, and 484 are superpalindromes.
		Note that 676 is not a superpalindrome: 26 * 26 = 676, but 26 is not a palindrome.
	 */
    public int superpalindromesInRange(String left, String right) {
    	
    	//convert left and right to long

    	long l = Long.valueOf(left);
    	long r = Long.valueOf(right);
    	
    	int count = 0;
    	
    	//Create a list of Palindromes in range 1, 10^5 = 100000

    
    	//even palindromes
    	for(int i = 1; i < 100000; i++) {
    		StringBuilder sb = new StringBuilder(Integer.toString(i));
    		for(int j = sb.length() - 1; j >= 0; j--) {
    			sb.append(sb.charAt(j));
    		}	
    		
    		long value = Long.valueOf(sb.toString());
    		value *= value;
    		if(value > r)
    			break;
    		else if(checkPalin(Long.toString(value)) && l <= value)
    			count++;
    	}
    	
    	//123 -> 12321
    	
    	//odd Palindromes
    	for(int i = 1; i < 100000; i++) {
    		StringBuilder sb = new StringBuilder(Integer.toString(i));
    		for(int j = sb.length() - 2; j >= 0; j--) {
    			sb.append(sb.charAt(j));
    		}	
    		
    		long value = Long.valueOf(sb.toString());
    		value *= value;
    		if(value > r)
    			break;
    		else if(checkPalin(Long.toString(value)) && l <= value)
    			count++;
    	}
  
    		
    		

		return count;
        
    }
    
    private boolean checkPalin(String num) {
    	for(int i = 0; i < num.length(); i++) {
    		if(num.charAt(i) != num.charAt(num.length() -1 - i))
    			return false;
    	}
    	    
    	
    	/*String s = new StringBuilder(num).reverse().toString();
    	for(int i = 0; i < num.length(); i++)
    		if(num.charAt(i) != s.charAt(s.length() -1 -i))
    			return false;*/
    	
    	return true;
    }

}
