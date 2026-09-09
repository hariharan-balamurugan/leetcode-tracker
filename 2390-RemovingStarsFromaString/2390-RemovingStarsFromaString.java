// Last updated: 9/9/2026, 12:34:20 PM
1class Solution {
2    public String removeStars(String s) {
3        Stack<Character>st =new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char c =s.charAt(i);
6            if(Character.isLetter(c)){
7                st.push(c);
8
9            }else if(c=='*'){
10                st.pop();
11            }
12        }
13        String result="";
14        for(char x:st){
15            result+=x;
16        }
17
18
19
20        return result;
21
22        
23    }
24}