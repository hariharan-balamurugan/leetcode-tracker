// Last updated: 7/27/2026, 9:57:16 PM
1class Solution {
2    public boolean strongPasswordCheckerII(String p) {
3        if(p.length()<8){
4	      return false;
5	 }
6	 boolean lower =false;
7	 boolean upper =false;
8	 boolean digit =false;
9	 boolean special =false;
10	 String s="!@#$%^&*()-+" ;
11	 for(int i=0;i<p.length();i++){
12	     char c =p.charAt(i);
13	   
14	     if(Character.isLowerCase(c)){
15	         lower= true;
16	     }
17	     if(Character.isUpperCase(c)){
18	         upper=true;
19	     }
20	     if(Character.isDigit(c)){
21	         digit= true;
22	     }
23	     if(s.contains(String.valueOf(c))){
24	         special= true;
25	     }
26	     if(i>0 && p.charAt(i)==p.charAt(i-1)){
27	           return false;
28	         
29	         
30	     }
31	     
32	 }
33	 return lower && upper && digit && special;
34	 
35        
36    }
37}