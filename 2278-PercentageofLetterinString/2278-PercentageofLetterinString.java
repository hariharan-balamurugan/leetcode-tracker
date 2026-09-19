// Last updated: 9/19/2026, 12:28:19 PM
1class Solution {
2    public int percentageLetter(String s, char l) {
3        int count=0;
4        for(int i=0;i<s.length();i++){
5            char c =s.charAt(i);
6            if(c==l){
7                count++;
8            }
9        }
10         int p=(count*100/s.length());
11    
12         return p;
13    }
14}