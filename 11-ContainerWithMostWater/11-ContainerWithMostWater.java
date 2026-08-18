// Last updated: 8/18/2026, 9:06:02 AM
1class Solution {
2    public int maxArea(int[] arr) {
3        int l=0;
4        int r=arr.length-1;
5        int max=0;
6        while(l<r){
7            int w =r-l;
8            int b =Math.min(arr[l],arr[r]);
9            int area=b*w;
10            max=Math.max(area,max);
11            if(arr[l]<arr[r]){
12                l++;
13            }else{
14                r--;
15            
16            
17            }
18
19        }
20        return max;
21        
22    }
23}