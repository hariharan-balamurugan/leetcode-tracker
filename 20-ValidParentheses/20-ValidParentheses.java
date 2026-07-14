// Last updated: 7/14/2026, 2:04:08 PM
class Solution {
    public boolean isValid(String s) {
        boolean valid =true;
        Stack<Character>st =new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}'){
                if(st.isEmpty()){
                    return false;
                }
            
            if(ch=='}' && st.peek()=='{'){
                st.pop();
            }
            else  if(ch==']' && st.peek()=='['){
                st.pop();
            }
            else if(ch==')' && st.peek()=='('){
                st.pop();
            }
            else{
                return false;
            }
        }
        }
        if(st.isEmpty()){
            return true;
        }
    
    return false;
        
        
    }
}