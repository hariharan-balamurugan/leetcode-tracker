// Last updated: 8/21/2026, 2:20:42 PM
1class Solution {
2    public int maxProductDifference(int[] nums) {
3        int max=Integer.MIN_VALUE;
4        int smax=0;
5        int min=Integer.MAX_VALUE;
6        int smin=0;
7        for(int i=0;i<nums.length;i++){
8            if(max<nums[i]){
9                smax =max;
10                max=nums[i];
11            }
12            else if(smax<nums[i]){
13                smax =nums[i];
14            }
15           
16           if(nums[i]<min){
17                smin=min;
18                min=nums[i];
19            }
20            else if(smin>nums[i]){
21                smin=nums[i];
22            }
23        }
24         int result =((max*smax)-(min*smin));
25         return result;
26    }
27       
28        
29
30      
31    
32}