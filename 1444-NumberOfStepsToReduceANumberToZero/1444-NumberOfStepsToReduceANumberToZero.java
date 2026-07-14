// Last updated: 7/14/2026, 2:00:09 PM
class Solution {
    public int numberOfSteps(int n) {
        int count=0;
		while(n>0) {
			if(n%2==0) {
				 n =n/2;//1	
			}else {
				n=n-1;
			}
			count++;
			
		}return count;
    }
}
				
    
