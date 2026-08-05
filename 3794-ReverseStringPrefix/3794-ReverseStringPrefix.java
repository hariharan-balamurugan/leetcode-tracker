// Last updated: 8/5/2026, 2:52:21 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3    String str ="";
4	for(int i=k-1;i>=0;i--){
5	    str+=s.charAt(i);
6	    
7	}
8	for(int i=k;i<s.length();i++){
9	    str+=s.charAt(i);
10	}
11	return str;
12        
13    }
14}