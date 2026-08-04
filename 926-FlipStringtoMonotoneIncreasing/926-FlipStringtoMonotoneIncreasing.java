// Last updated: 8/4/2026, 12:15:13 PM
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3        	    int count=0;
4	    int flip=0;
5	    for(int i=0;i<s.length();i++){
6	        char c=s.charAt(i);
7	        if(c=='1'){
8	            count++;
9	        }else{
10	            flip++;
11	            
12	        }
13	        flip=Math.min(flip,count);
14	    }
15	    return flip;
16
17        
18    }
19}