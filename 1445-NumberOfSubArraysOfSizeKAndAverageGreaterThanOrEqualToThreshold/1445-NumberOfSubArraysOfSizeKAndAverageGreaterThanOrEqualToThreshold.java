// Last updated: 7/14/2026, 2:00:04 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
         int left=0;
	    int sum=0;
	    int avg=0;
	    int count=0;
	    for(int right=0;right<arr.length;right++){//2
	        sum+=arr[right];  //2
	        if(right-left+1==k){
	            avg=sum/k;
	            if(avg>=t){
	                count++;
	                
	            }
	            sum-=arr[left];
	            left++;
	            
	        }
	        
	    }
	   return count;
        
    }
}