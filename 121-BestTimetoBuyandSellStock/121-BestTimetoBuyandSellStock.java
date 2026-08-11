// Last updated: 8/11/2026, 11:35:08 AM
1class Solution {
2    public String clearDigits(String s) {
3        Stack<Character>stack =new Stack<>();
4        String valid="";
5       
6        for(int i=0;i<s.length();i++){
7            char c =s.charAt(i);
8            if(!Character.isDigit(c)){
9                stack.push(c);
10
11            }
12            if(Character.isDigit(c) ==Character.isLetter(stack.peek())){
13                stack.pop();
14            }
15
16        }
17        while(!stack.isEmpty()){
18            valid=stack.pop()+valid;
19        }
20        return valid;
21
22        
23    }
24}