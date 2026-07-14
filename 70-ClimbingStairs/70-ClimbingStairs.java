// Last updated: 7/14/2026, 2:03:30 PM
class Solution {
    public int climbStairs(int n) {
        int a=1,b=2,c=3, d=0;
		if(n==1) {
			return n;
		}if(n==2) {
			return n;	
		}if(n==3) {
			return n;         
		}
		while(n-->3) {
			d=b+c;
			a=b;
			b=c;
			c=d;
			
			
		}return d;
        
    }
}