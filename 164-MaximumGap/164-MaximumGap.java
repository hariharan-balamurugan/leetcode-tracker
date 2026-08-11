// Last updated: 8/11/2026, 2:20:22 PM
1class Solution {
2    public int maximumGap(int[] nums) {
3        Arrays.sort(nums);
4        int max =0;
5        if(nums.length<2){
6            return 0;
7        }else{
8            for(int i=0;i<nums.length-1;i++){
9                int minus =nums[i+1]-nums[i];
10                
11                max=Math.max(max,minus);
12 
13                
14            }
15        }
16        return max;
17    }
18}