// Last updated: 7/28/2026, 9:00:14 PM
1class Solution {
2    public boolean isPalindrome(String str) {
3        str=str.toLowerCase();
4			str=str.replaceAll("[^a-z0-9]", "");
5           
6            int l=0;
7            int r =str.length()-1;
8           
9            
10            
11
12           
13            while(l<r){
14                if(str.charAt(l)!=str.charAt(r)){
15                    return false;
16                }
17                l++;
18                r--;
19            }
20            return true;
21			
22				
23
24    }
25}