// Last updated: 8/23/2026, 8:43:01 PM
1class Solution {
2    public boolean searchMatrix(int[][] m, int target) {
3        int row =m.length;
4        int col=m[0].length;
5        int left =0;
6        int right =row*col-1;
7        while(left<=right){
8            int mid=left+(right-left)/2;
9            int rows =mid/col;
10              int cols=mid%col;
11             if(m[rows][cols]==target){
12                return true;
13             }else if(m[rows][cols]<target){
14                left=mid+1;
15             }else{
16                right=mid-1;
17             }
18        }
19        return false;
20        
21    }
22}