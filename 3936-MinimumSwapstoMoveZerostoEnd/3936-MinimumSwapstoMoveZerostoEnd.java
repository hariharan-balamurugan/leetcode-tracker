// Last updated: 10/1/2026, 2:11:59 PM
1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int z =0;
4        for(int x:nums){
5            if(x==0){
6                z++;
7            }
8        }
9        int count=0;
10        for(int i =nums.length-z;i<nums.length;i++){
11            if(nums[i]!=0){
12                count++;
13            }
14        }
15        return count;
16        
17    }
18}