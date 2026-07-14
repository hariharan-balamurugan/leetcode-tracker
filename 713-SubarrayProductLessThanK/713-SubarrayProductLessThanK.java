// Last updated: 7/14/2026, 2:01:09 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
    
       int prod=1;
		int count =0;
		int i=0;//2
		int j=0;//10
		while(i<arr.length) { 
			prod*=arr[i];
			while(prod>=k) {
				prod/=arr[j];
				j++;
				
			}
				count+=i-j+1;
			
		
			i++;
		}
	
	return count;	
	}

        
    }
