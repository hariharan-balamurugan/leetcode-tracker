// Last updated: 7/26/2026, 9:56:08 PM
1class Solution {
2    public String removeDuplicates(String str) {
3        Stack<Character>st =new Stack<>();
4		String str1="";
5		for(int i=0;i<str.length();i++){
6		    char c =str.charAt(i);
7		    // st.push(c);
8		 
9		     if(!st.isEmpty() &&st.peek()==c){
10		         st.pop();
11		    }else{
12		       
13		        st.push(c);
14		    }
15		}
16		for(char s:st){
17		    str1+=s;
18		}
19		return str1;
20		
21        
22    }
23}