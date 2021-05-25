
public class ToLowerString {
    public String toLowerCase(String s) {
    	String ans = "";
    	
    	for(char c: s.toCharArray()) {
    		if(c >= 'A' && c <= 'Z')
    			c = (char)(c + ('a' - 'A'));
    		
    		ans = ans.concat(Character.toString(c));
    	}
    	
    	 return ans;
    }
    
    public static void main(String[] args) {
    	ToLowerString ls = new ToLowerString();
    	String s = ls.toLowerCase("Hello");
    	System.out.println(s);
    	
    	/*char c = 'B';
    	
    	String s = "";
    	if(c >= 'A' && c <= 'Z') {
    		c = (char)(c + ('a' - 'A'));
    	}
    	
    	s = s.concat(Character.toString(c));
    	System.out.println(s);*/
    	
    	
    }
    
   

}
