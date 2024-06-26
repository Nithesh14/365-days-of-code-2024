public class Solution {
	public int isPrime(int A) {
		int upperLimit = (int)(Math.sqrt(A));
        
        if(A == 1) return 0;
		for (int i = 2; i <= upperLimit; i++) {
			if (i < A && A % i == 0) return 0;
		}
		return 1;
	}
}
