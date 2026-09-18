// Last updated: 9/18/2026, 2:17:56 PM
1class Solution {
2    public boolean validateStackSequences(int[] pus, int[] poped) {
3        Stack<Integer>st =new Stack<>();
4        int j=0;
5        for(int x:pus){
6            st.push(x);
7            while(!st.isEmpty() && st.peek()==poped[j]){
8                st.pop();
9                j++;
10            }
11        }
12        return st.isEmpty();
13        
14    }
15}