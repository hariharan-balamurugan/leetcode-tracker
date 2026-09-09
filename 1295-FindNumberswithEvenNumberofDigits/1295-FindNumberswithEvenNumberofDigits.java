// Last updated: 9/9/2026, 6:12:21 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int v=0;
4        for(int i=0;i<nums.length;i++){
5            int n=nums[i];
6            int count=0;
7            while(n!=0){
8                int l=n%10;
9                count++;
10                n/=10;
11            }
12            int s=count;
13            if(s%2==0){
14                v++;
15
16            }
17        }
18        return v;
19        
20    }
21}