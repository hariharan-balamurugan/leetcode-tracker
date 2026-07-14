// Last updated: 7/14/2026, 2:02:45 PM
class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int min =0;
        for(int i=0;i<nums.length;i++){
            min=nums[0];
        }
        return min;
        
    }
}