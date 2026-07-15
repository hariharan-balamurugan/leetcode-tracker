// Last updated: 7/15/2026, 4:20:24 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        int n =0;
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length;i++){
6            n =nums[nums.length-k];
7
8        }
9        return n;
10    }
11}