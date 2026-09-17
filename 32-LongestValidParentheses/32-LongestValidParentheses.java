// Last updated: 9/17/2026, 12:06:40 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer>st =new Stack<>();
4        st.push(-1);
5        int max =0;
6        for(int i=0;i<s.length();i++){
7          
8            if( s.charAt(i)=='('){
9                st.push(i);
10            }else{
11                st.pop();
12                if(st.isEmpty()){
13                    st.push(i);
14                }else{
15                    max =Math.max(max,i-st.peek());
16                }
17            }
18            
19        }
20        return max;
21        
22    }
23}