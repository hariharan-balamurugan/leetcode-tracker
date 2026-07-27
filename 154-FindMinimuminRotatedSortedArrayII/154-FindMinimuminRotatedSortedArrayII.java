// Last updated: 7/27/2026, 8:55:58 PM
1class Solution {
2    public long countVowels(String str) {
3        long s=0;
4		int n=str.length();
5		for(int i=0;i<str.length();i++){
6		    char c = str.charAt(i);
7             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
8                s += (long)(i + 1) * (n - i);
9          }
10		   
11		
12		    
13		}
14		return s;
15        
16    }
17}