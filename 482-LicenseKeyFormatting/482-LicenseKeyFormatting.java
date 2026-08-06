// Last updated: 8/6/2026, 11:55:07 AM
1class Solution {
2    public String licenseKeyFormatting(String str, int k) {
3          Stack<Character>stack = new Stack<>();
4          String str1="";
5	    for(char c:str.toCharArray()){
6	        if(c!='-'){
7	            stack.push(Character.toUpperCase(c));
8	        }
9
10	    }
11	    StringBuilder sb =new StringBuilder();
12	    int count=0;
13	    while(!stack.isEmpty()){
14	        sb.append(stack.pop());
15	        count++;
16	        
17	        if(count==k && !stack.isEmpty()){
18	            sb.append('-');
19	            count=0;
20	        }
21	    }
22	        str1+= sb.reverse();
23            return str1;
24        
25    }
26}