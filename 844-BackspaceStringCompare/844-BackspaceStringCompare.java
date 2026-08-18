// Last updated: 8/18/2026, 2:27:09 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character>st =new Stack<>();
4		Stack<Character>st1=new Stack<>();
5		for(int i=0;i<s.length();i++){
6		    char c = s.charAt(i);
7		    if(Character.isLetter(c)){
8		        st.push(c);
9		    }else if(c=='#'){
10		        if(!st.isEmpty()){
11                    st.pop();
12                }
13		    }
14		}
15		for(int i=0;i<t.length();i++){
16		    char c1 = t.charAt(i);
17		    if(Character.isLetter(c1)){
18		        st1.push(c1);
19		    }else if(c1=='#'){
20                  if(!st1.isEmpty()){
21                    st1.pop();
22                }
23		    
24		    }
25		}
26		return st.equals(st1);
27		    
28		
29		
30        
31    }
32}