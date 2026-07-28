// Last updated: 7/28/2026, 12:42:41 PM
1class Solution {
2    public int[] searchRange(int[] arr, int tar) {
3        	int start = -1;
4            int end = -1;
5    //int[]arr =new int [2];
6    int n=0;
7    for (int k = 0; k < arr.length; k++) {
8       if (arr[k] == tar) {
9          if (start == -1)
10             start = k;
11             
12              end = k;
13    }
14}
15    return new int[]{start,end};
16
17        
18    }
19}