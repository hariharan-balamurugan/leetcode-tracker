// Last updated: 7/24/2026, 9:27:14 PM
1class Solution {
2    public int titleToNumber(String s) {
3        int total =0;
4        for(int i=0;i<s.length();i++){
5            char c =s.charAt(i);
6            int asci =c-64;
7            total=(total*26)+asci;
8        }
9        return total;
10        
11    }
12}