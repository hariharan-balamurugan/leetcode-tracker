// Last updated: 8/17/2026, 2:27:44 PM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int sum =0;
4        int n=mat.length;
5        for(int i=0;i<mat.length;i++){
6            for(int j=0;j<mat.length;j++){
7                if(i==j||(i+j)==n-1){
8                    sum+=mat[i][j];
9                }
10                
11            }
12        }
13        return sum;
14
15        
16    }
17}