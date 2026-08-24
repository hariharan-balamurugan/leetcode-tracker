// Last updated: 8/24/2026, 12:18:10 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int row =0;
4        int col =matrix[0].length-1;
5       
6        while(row < matrix.length && col >= 0){
7
8         
9            
10            if(matrix[row][col]==target){
11                return true;
12            }else if(matrix[row][col]>target){
13                  col--;
14            }else{
15                row++;
16
17            }
18
19   }
20   return false;
21
22        
23    }
24}