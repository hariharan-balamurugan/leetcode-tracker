// Last updated: 8/10/2026, 2:02:16 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int p[]= new int[nums.length];
4        int s[] =new int[nums.length];
5        p[0]=nums[0];
6        s[nums.length-1] =nums[nums.length-1];
7        for(int i=1;i<nums.length;i++){
8            p[i]=p[i-1]+nums[i];
9        }
10        for(int i=nums.length-2;i>=0;i--){
11            s[i]=s[i+1]+nums[i];
12        }
13        for(int i=0;i<nums.length;i++){
14            if(p[i]==s[i]){
15                return i;
16            }
17        }
18        return -1;
19        
20    }
21}