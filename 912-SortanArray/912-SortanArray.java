// Last updated: 7/27/2026, 11:50:34 AM
1class Solution {
2    public int[] sortArray(int[] nums) {
3        int[] arr =new int[nums.length];
4        Arrays.sort(nums);
5        int k=0;
6        for(int i=0;i<nums.length;i++){
7            arr[k++]=nums[i];
8        }
9        return arr;
10        
11    }
12}