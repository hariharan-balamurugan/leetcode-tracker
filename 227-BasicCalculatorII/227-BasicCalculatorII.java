// Last updated: 9/9/2026, 2:25:47 PM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> st =new Stack<>();
4        char sign='+';
5        int num=0;
6        for(int i=0;i<s.length();i++){
7            char c =s.charAt(i);
8            if(Character.isDigit(c)){
9                num=num*10+(c-'0');
10            }
11             if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
12                if(sign=='+'){
13                    st.push(num);
14                }
15                else if(sign=='-'){
16                    st.push(-num);
17                }else if(sign=='*'){
18                    st.push(st.pop()*num);
19                }else if(sign=='/'){
20                    st.push(st.pop()/num);
21                }
22                sign=c;
23                 num=0;
24
25
26
27             }
28             
29
30
31        }
32             int res=0;
33              for (int x : st) {
34                    res += x;
35           }
36
37        return res;
38        
39
40    }
41}