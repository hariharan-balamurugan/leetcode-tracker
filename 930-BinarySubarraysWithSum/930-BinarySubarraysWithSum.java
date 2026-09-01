// Last updated: 9/1/2026, 10:30:04 PM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        int left =0;
4        int count=0;
5       for(int i=0;i<nums.length;i++){
6            int sum=0;
7          for(int j=i;j<nums.length;j++){
8            sum+=nums[j];
9            
10          
11                if(sum==goal){
12                    count++;
13                }
14          }
15       }
16       return count;
17        
18    }
19}