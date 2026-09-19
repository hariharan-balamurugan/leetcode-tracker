// Last updated: 9/19/2026, 11:23:10 AM
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length-1;i++){
5            if(nums[i]>nums[i+1]){
6                if(c==1){
7                    return false;
8                }
9            
10            if(i==0||nums[i-1]<=nums[i+1]){
11                nums[i]=nums[i+1];
12            }
13            else{
14                nums[i+1]=nums[i];
15            }
16            c++;
17            }
18        }
19        return true;
20        
21    }
22}