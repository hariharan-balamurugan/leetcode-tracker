// Last updated: 9/1/2026, 2:07:49 PM
1class Solution {
2    public int subarraySum(int[] nums, int n) {
3        int left=0;
4       // int sum=0;
5        int c=0;
6        for(int i=0;i<nums.length;i++){
7               int sum=0;
8            for(int j=i;j<nums.length;j++){
9                sum+=nums[j];
10                
11                
12            if(sum==n){
13                c++;
14            }
15            }
16        }
17     return c;
18
19        
20    }
21}