// Last updated: 9/22/2026, 3:23:02 PM
1class Solution {
2    public int countSegments(String s) {
3        String [] arr =s.trim().split("\\s+");
4        if(s.trim().isEmpty()){
5            return 0;
6        }
7        return arr.length;
8        
9    }
10}