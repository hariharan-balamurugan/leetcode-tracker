// Last updated: 7/14/2026, 2:02:39 PM
class Solution {
    public int trailingZeroes(int n) {
        int fact=1;
		int count=0;
		 while (n >= 5) {
	            n /= 5;
	            count += n;
	        }
	        return count;
        
    }
}