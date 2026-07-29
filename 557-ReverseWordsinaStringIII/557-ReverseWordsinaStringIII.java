// Last updated: 7/29/2026, 9:31:18 PM
1class Solution {
2    public String reverseWords(String s) {
3         String w ="";
4	   s+=" ";
5       String result="";
6	   for(int i=0;i<s.length();i++){
7	       char c =s.charAt(i);
8	       if(c!=' '){
9	           w+=c;
10	       }else{
11	           for(int j=w.length()-1;j>=0;j--){
12	               result+=w.charAt(j);
13	           }
14	           result += " ";
15	            w="";
16	       }
17	   }
18       return result.trim();
19	}
20        
21    }
22