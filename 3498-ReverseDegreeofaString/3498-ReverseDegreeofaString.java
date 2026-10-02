// Last updated: 10/2/2026, 1:24:51 PM
1class Solution {
2    public int reverseDegree(String str) {
3         HashMap<Character,Integer>map =new HashMap<>();
4	    int c=1;
5	   for(int i='z';i>='a';i--){
6	      map.put((char)i,c);
7	      c++;
8	   }
9	   int sum=0;
10	    for(int i=0;i<str.length();i++){
11	        char ch =str.charAt(i);
12	        int m=0;
13	       
14	        sum+=(map.get(ch)*(i+1));
15	        
16	        
17	        
18	    }
19	  return sum;
20        
21    }
22}