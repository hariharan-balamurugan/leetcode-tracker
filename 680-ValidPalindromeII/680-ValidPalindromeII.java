// Last updated: 7/29/2026, 11:16:40 AM
1class Solution {
2    static boolean ispalin(String s,int l,int r){
3       
4        while(l<r){
5        if(s.charAt(l)!=s.charAt(r)){
6            return false;
7
8        }
9
10            l++;
11            r--;
12
13    }
14    return true;
15    }
16    public boolean validPalindrome(String s) {
17       int l=0;
18       int r =s.length()-1;
19       while(l<r){
20        if(s.charAt(l)!=s.charAt(r)){
21            return ispalin(s,l+1,r)||ispalin(s,l,r-1);
22            
23        }
24        else{
25            l++;
26            r--;
27            
28
29        }
30        
31
32       }
33       return true;
34    }
35}
36   
37