// Last updated: 9/17/2026, 2:54:58 PM
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3        for(int i=1;i<s.length();i++){
4            int d =Math.abs(s.charAt(i)-s.charAt(i-1));
5            if(d>2){
6                return false;
7            }
8        }
9        return true;
10        
11    }
12}