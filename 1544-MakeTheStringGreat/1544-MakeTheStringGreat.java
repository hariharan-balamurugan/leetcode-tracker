// Last updated: 8/24/2026, 2:22:25 PM
1class Solution {
2    public String makeGood(String s) {
3        Stack<Character>st =new Stack<>();
4        for(char x:s.toCharArray()){
5            if(!st.isEmpty() && Character.isLowerCase(st.peek())&&Character.isUpperCase(x)){
6                if(Character.toLowerCase(x)==st.peek()){
7                    st.pop();
8                    continue;
9                }
10            }
11            if(!st.isEmpty() && Character.isUpperCase(st.peek())&&Character.isLowerCase(x)){
12                if(Character.toLowerCase(st.peek())==x){
13                    st.pop();
14                    continue;
15                }
16            }
17            st.push(x);
18        }
19    String w="";
20    for(char x:st){
21        w+=x;
22    }
23    return w;
24        
25    }
26}