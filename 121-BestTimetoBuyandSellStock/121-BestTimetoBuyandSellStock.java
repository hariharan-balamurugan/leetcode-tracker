// Last updated: 8/11/2026, 12:07:07 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        
4        int count=0;
5        int v =0;
6        for(int i=0;i<moves.length();i++){
7            char c =moves.charAt(i);
8            if(c=='U'){
9                count++;
10                
11            }else if(c=='D'){
12                count--;
13            }else if(c=='L'){
14                v++;
15            }else if(c=='R'){
16                v--;
17            }
18            
19            
20              
21        }
22        if(count==0 && v==0){
23            return true;
24        }
25        return false;
26
27        
28    }
29}