// Last updated: 7/30/2026, 9:34:02 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int max =Integer.MIN_VALUE;
4        int index =0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>max){
7                max =nums[i];
8                index=i;
9            }
10
11        }
12        return index;
13        
14        
15        
16    }
17}