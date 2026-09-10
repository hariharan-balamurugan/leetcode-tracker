// Last updated: 9/10/2026, 11:21:04 AM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        int l=0;
4        int c=0;
5        int o=0;
6        int res=0;
7        for(int r=0;r<nums.length;r++){
8            if(nums[r]%2!=0){
9                o++;
10                c=0;
11            }
12            while(o==k){
13                if(nums[l]%2!=0){
14                    o--;
15                }
16                l++;
17                c++;
18            }
19        res+=c;
20        }
21        return res;
22        
23    }
24}