// Last updated: 7/14/2026, 2:00:33 PM
class Solution {
    public int fib(int a) {
         if(a==0) {
			 return 0;
		 }
		 else if(a==1) {
			 return 1;
		 }
		 
		return fib(a-1)+fib(a-2);
		
	}
}
	
        
    