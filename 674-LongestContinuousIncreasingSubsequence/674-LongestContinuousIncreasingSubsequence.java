// Last updated: 8/17/2026, 2:01:08 PM
1class Solution {
2    public int findLengthOfLCIS(int[] nums) {
3        int count=0;
4        int max =0;
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]<nums[i+1]){
7                count++;
8            }else {
9               count=0; 
10                
11            }
12            max =Math.max(max,count);
13        }
14        return max+1;
15
16        
17    }
18}