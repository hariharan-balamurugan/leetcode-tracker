// Last updated: 8/18/2026, 12:08:09 PM
1class Solution {
2    public boolean isValid(String str) {
3        Stack<Character>st =new Stack<>();
4	//String str ="([])";
5	for(int i=0;i<str.length();i++){
6	    char c =str.charAt(i);
7	    if(c=='('||c=='['||c=='{'){
8	        st.push(c);
9	    }
10        else{
11            if(st.isEmpty()){
12                return false;
13            }
14               char top=st.peek();
15	        if(c==')' && top=='('||c==']' && top=='['||c =='}' && top=='{'){
16	           st.pop();
17	       }
18           else{
19            return false;
20           }
21	    
22	    
23	}
24    
25        
26    }
27    return st.isEmpty();
28    
29    
30    //return false;
31}
32}