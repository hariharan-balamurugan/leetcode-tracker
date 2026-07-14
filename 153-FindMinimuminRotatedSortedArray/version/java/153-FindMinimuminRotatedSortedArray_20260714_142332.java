// Last updated: 7/14/2026, 2:23:32 PM
1class Solution {
2    public int findMin(int[] nums) {
3        Arrays.sort(nums);
4        int min =0;
5        for(int i=0;i<nums.length;i++){
6            min=nums[0];
7        }
8        return min;
9        
10    }
11}