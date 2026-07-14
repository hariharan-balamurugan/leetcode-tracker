// Last updated: 7/14/2026, 2:00:18 PM
class Solution {
    public int subtractProductAndSum(int a) {
        	int prd=1;
		int sum=0;
		while(a!=0) {
			int last = a%10;
			prd*=last;
			sum+=last;
			a=a/10;
			
		}
		return prd-sum;
		
			
        
    }
}