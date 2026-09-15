// Last updated: 9/15/2026, 10:36:59 AM
1class Solution {
2    public int passwordStrength(String password) {
3        HashSet<Character> s = new HashSet<>();
4        for(char c : password.toCharArray()){
5            s.add(c);
6        }
7        String p="";
8        for(char x:s){
9            p+=x;
10        }
11        int sum =0;
12        for(int i=0;i<p.length();i++){
13            char c =p.charAt(i);
14            if(Character.isLowerCase(c)){
15                sum+=1;
16            }else if(Character.isUpperCase(c)){
17                sum+=2;
18            }else if(Character.isDigit(c)){
19                sum+=3;
20            }else{
21                sum+=5;
22            }
23        }
24        return sum;
25        
26    }
27}