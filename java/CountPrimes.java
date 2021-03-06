/**
* reference: https://leetcode.com/discuss/explore/may-leetcoding-challenge-2021/1200799/Count-Primes-or-JS-Python-Java-C%2B%2B-or-Easy-Sieve-of-Eratosthenes-Solution-w-Explanation
*/
public class CountPrimes {

	public int countPrimes(int n) {

	int count = 0;
	boolean[] mark = new boolean[n];
	
	
   
	
	for(int i = 2; i * i < n; i++) {
		if(mark[i]) //false(marked off)
			continue;
		// p: p * p, p * p + p, p*p+2p... 
		for(int j = i * i; j < n; j += i) {
			mark[j] = true;
			
		}
		
	}
	for(int i = 2; i < n; i++)
		if(!mark[i])
			count++;

	
	return count;

	}

	
}
