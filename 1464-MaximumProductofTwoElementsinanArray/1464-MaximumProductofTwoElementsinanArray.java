// Last updated: 7/27/2026, 12:08:39 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        int lar =nums[nums.length-1];
5        int sec =nums[nums.length-2];
6        int max =((lar-1)*(sec-1));
7        return max;
8        
9    }
10}