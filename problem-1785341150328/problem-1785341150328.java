// Last updated: 7/29/2026, 9:35:50 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        //Arrays.sort(nums);
4        int[] arr =new int[nums.length];
5        int k=0;
6        for(int i=0;i<nums.length;i++){
7            arr[k++]=(int)Math.pow(nums[i],2);
8        
9        }
10        Arrays.sort(arr);
11        return arr;
12
13        
14    }
15}