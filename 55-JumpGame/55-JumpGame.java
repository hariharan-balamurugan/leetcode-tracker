// Last updated: 8/20/2026, 2:09:39 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int last= nums.length-1;
4
5        int i=0;
6        int j=0;
7        if(nums.length==2){
8            if(nums[0]>nums[1]){
9                return true;
10
11              }
12
13        }
14        if(nums.length==1){
15            return true;
16        }
17        if(nums[0]==0){
18            return false;
19        }
20        
21        
22        boolean found=false;
23            int sum=0;
24            int index =0;
25        while(i<nums.length ){
26             if (i > j) {
27                return false;
28            }
29
30            
31            j = Math.max(j, i + nums[i]);
32
33           
34            if (j >= last) {
35                return true;
36            }
37
38            i++;
39        }
40        return false;
41        }
42       
43       }
44    
45
46    
47