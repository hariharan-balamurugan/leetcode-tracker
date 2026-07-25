// Last updated: 7/25/2026, 3:22:27 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] arr) {
3         int max =0;
4	      
5	     int count=0;
6	      for(int i=0;i<arr.length;i++){
7	          
8	          if(arr[i]==1){
9	              count++;
10	          }
11	          else if(arr[i]==0){
12	              count=0;
13	          }
14	          
15	          max =Math.max(max,count);
16	          
17	          
18	        
19            
20	      }
21	      return max;
22	      
23	         
24
25        
26    }
27}