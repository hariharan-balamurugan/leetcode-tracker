// Last updated: 9/28/2026, 10:17:27 PM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        String str ="";
4        int min =Math.min(word1.length(),word2.length());
5        for(int i=0;i<min;i++){
6            str+=word1.charAt(i);
7            str+=word2.charAt(i);
8        }
9        if(word1.length()>min){
10            str+=word1.substring(min);
11        }
12        if(word2.length()>min){
13            str+=word2.substring(min);
14        }
15        return str;
16        
17    }
18}