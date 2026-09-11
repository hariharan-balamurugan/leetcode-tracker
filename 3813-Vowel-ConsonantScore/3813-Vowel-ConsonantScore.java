// Last updated: 9/11/2026, 2:51:17 PM
1class Solution {
2    public int vowelConsonantScore(String s) {
3        int v =0;
4        int con=0;
5        for(int i=0;i<s.length();i++){
6            char c = s.charAt(i);
7           if(Character.isAlphabetic(c)){
8            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
9                v++;
10            }else{
11                con++;
12            }
13           }
14        }
15        int sco= 0;
16        if(con>0){
17            sco=(int)Math.floor(v/con);
18
19        }
20        return sco;
21        
22        
23    }
24}