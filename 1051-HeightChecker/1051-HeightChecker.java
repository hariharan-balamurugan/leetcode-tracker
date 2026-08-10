// Last updated: 8/10/2026, 1:31:04 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3         int[] height =new int[heights.length];
4        int[] expected =new int[heights.length];
5        int k=0;
6        for(int i=0;i<heights.length;i++){
7            height[k++]=heights[i];
8
9        }
10        Arrays.sort(heights);
11        int l=0;
12        for(int i=0;i<heights.length;i++){
13            expected[l++]=heights[i];
14
15        }
16         
17         int count=0;
18         
19         for(int i=0;i<height.length;i++){
20                 if(height[i]!=expected[i]){
21                     count++;
22                     
23                        
24                 }
25             
26         }
27         return count;
28        
29    }
30}