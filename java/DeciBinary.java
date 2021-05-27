
public class DeciBinary {
	public int minPartitions(String n) {
		int max = Integer.valueOf(n.charAt(0)) - '0';
		
		int i = 1;
		while(i < n.length()) {
			if(max < (Integer.valueOf(n.charAt(i)) - '0'))
				max = Integer.valueOf(n.charAt(i)) - '0';
			i++;
		}
		
		return max;
	}

}
