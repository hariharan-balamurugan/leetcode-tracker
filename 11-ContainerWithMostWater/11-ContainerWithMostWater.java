// Last updated: 7/24/2026, 6:19:31 PM
1class Solution {
2    public int maxArea(int[] arr) {
3        int l=0;
4        int r=arr.length-1;
5        int max =0;
6        //Arrays.sort(arr);
7        while(l<r){
8          int min=(r-l)*Math.min(arr[l],arr[r]);
9          max=Math.max(min,max);
10          if(arr[l]<arr[r]){
11            l++;
12          }
13          else{
14            r--;
15          }
16        }
17        return max;
18    }
19}