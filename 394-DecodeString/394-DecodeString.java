// Last updated: 9/11/2026, 11:14:56 AM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> numstack =new Stack<>();
4        Stack<StringBuilder>strstack =new Stack<>();
5        int n=0;
6        StringBuilder ans =new StringBuilder();
7        for(char c : s.toCharArray()){
8            if(Character.isDigit(c)){
9                n=(n*10)+(c-'0');
10            }
11            else if(c=='['){
12                numstack.push(n);
13                n=0;
14                strstack.push(ans);
15                 ans =new StringBuilder();
16
17            }else if(c==']'){
18                String str =ans.toString();
19                ans=new StringBuilder(str.repeat(numstack.pop()));
20                ans =strstack.pop().append(ans);
21
22
23            }else{
24                ans.append(c);
25
26            }
27        }
28        return ans.toString();
29        
30        
31    }
32}