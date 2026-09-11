// Last updated: 9/11/2026, 2:35:35 PM
1class Solution {
2    public int dominantIndices(int[] nums) {
3        int count =0;
4        for(int i=0;i<nums.length-1;i++){
5            int c =0;
6            int s=0;
7            for(int j=i+1;j<nums.length;j++){
8                s+=nums[j];
9                c++;
10            }
11           
12           int avg =s/c;
13            if(nums[i]>avg){
14                count++;
15         
16            }
17
18        }
19        return count;
20        
21    }
22}