// Last updated: 7/14/2026, 2:00:02 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n =nums.length;
		int []ans =new int[n];
		for(int i=0;i<nums.length;i++) {
			int count=0; 
			for(int j=0;j<nums.length;j++) {
				if(nums[j]<nums[i]){
					 count++;	
                }
				
			}ans[i]=count;
			

			
		}
		return ans;
        
    }
}