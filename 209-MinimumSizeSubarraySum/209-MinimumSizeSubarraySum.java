// Last updated: 7/14/2026, 2:02:36 PM
class Solution {
    public int minSubArrayLen(int k, int[] arr) {
       
		int left=0;
		int sum=0;
		int min=Integer.MAX_VALUE;;
		for(int right=0;right<arr.length;right++){
		    sum+=arr[right];
		    while(sum>=k){
		        min=Math.min(min,right-left+1);
		        
		         sum-=arr[left];
		         left++;
		    }
		   
		}
	return min == Integer.MAX_VALUE ? 0 : min;
		
        
    }
}