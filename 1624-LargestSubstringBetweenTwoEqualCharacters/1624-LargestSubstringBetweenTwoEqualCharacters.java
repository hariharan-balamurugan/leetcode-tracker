// Last updated: 8/21/2026, 3:17:12 PM
1class Solution {
2    static boolean iscount(String sub) {
3        return sub.charAt(0) == sub.charAt(sub.length()-1);
4    }
5    public int maxLengthBetweenEqualCharacters(String s) {
6        int count=0;
7	 
8	    String str="";
9	    boolean found=  false;
10        int max=Integer.MIN_VALUE;
11	    
12	    for(int i=0;i<s.length();i++){
13	        for(int j=i;j<s.length();j++){
14	            String sub =s.substring(i,j+1);
15	            if(sub.length()>=2 && iscount(sub)){
16	                found =true;
17	                str=sub.substring(1,sub.length()-1);
18	                count=str.length();
19                    max=Math.max(max,count);
20	               
21	                
22	            }
23	           
24	        }
25	    }
26	    if(found){
27	        
28	       return max;
29	    }
30        return -1;
31	       
32
33    
34    }
35
36}