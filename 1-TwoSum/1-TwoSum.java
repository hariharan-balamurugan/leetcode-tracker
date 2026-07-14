// Last updated: 7/14/2026, 2:04:33 PM
class Solution {
    public int[] twoSum(int[] nums, int t) {
       
		int count[]= new int[2];
		for(int i=0;i<nums.length;i++) {           //[2,7,11,15], target = 9
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==t&&i!=j) {
					count[0]=i;
					count[1]=j;
					return count;
					
				}
				
			}
		
	}
		return count;
	}

        
    }
