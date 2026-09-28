// Last updated: 9/28/2026, 5:47:51 PM
1class Solution {
2    public int maxDepth(String s) {
3        Stack<Integer> st =new Stack<>();
4        int res =0;
5        for(int i=0;i<s.length();i++){
6            char c =s.charAt(i);
7            if(c=='('){
8                st.push(i);
9            }else if(c==')'){
10                if(st.size()>0){
11                    st.pop();
12                }
13            }
14             res =Math.max(res,st.size());
15        }
16        return res;
17        
18    }
19}