// Last updated: 9/19/2026, 11:30:32 AM
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length-1;i++){
5            if(nums[i]>nums[i+1]){
6                if(c==1){
7                    return false;
8                }
9               if(i==0||nums[i-1]<=nums[i+1]){
10                    nums[i]=nums[i+1];
11               }
12               else{
13                 nums[i+1]=nums[i];
14
15               }
16            c++;
17            }
18
19        }
20        return true;
21        
22    }
23}