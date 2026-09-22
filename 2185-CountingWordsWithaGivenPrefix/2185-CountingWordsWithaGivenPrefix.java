// Last updated: 9/22/2026, 12:15:43 PM
1class Solution {
2    public int prefixCount(String[] words, String pref) {
3        int count=0;
4     for(String x:words){
5        if(x.startsWith(pref)){
6            count++;
7        }
8     }
9     return count;
10    }
11}