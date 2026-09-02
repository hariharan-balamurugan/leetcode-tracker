// Last updated: 9/2/2026, 3:11:18 PM
1class Solution {
2    static boolean isace(int[] nums){
3        int i=0;int j=i+1;
4        while(i<nums.length && j<nums.length){
5            if(nums[i]>nums[j]){
6                return false;
7            }
8                i++;
9                j++;
10        }
11        return true;
12    }
13    static  boolean isdec(int[] nums){
14        int i=0; int j=i+1;
15        while(i<nums.length && j<nums.length){
16            if(nums[i]<nums[j]){
17                return false;
18            }
19            i++;
20            j++;
21        }
22        return true;
23    }
24    public boolean isMonotonic(int[] nums) {
25        int max =Integer.MIN_VALUE;
26        int f =nums[0];
27        for(int i=0;i<nums.length;i++){
28            max =Math.max(max,nums[i]);
29        }
30        if(max==f){
31            return isdec(nums);
32
33        } else {
34            return isace(nums);
35
36        }
37        
38  
39           
40    
41
42        
43    }
44}
45