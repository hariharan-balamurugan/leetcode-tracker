// Last updated: 9/15/2026, 11:20:47 AM
1class Solution {
2    public boolean isMiddleElementUnique(int[] nums) {
3        int mid =(int)nums.length/2;
4       int count=0;
5       for(int x:nums){
6          if(x==nums[mid]){
7            count++;
8          }
9       }
10       if(count==1){
11           return true;
12       }
13       return false;
14        
15    }
16}