// Last updated: 8/17/2026, 3:30:07 PM
1class Solution {
2    public boolean squareIsWhite(String s) {
3       int[][] arr ={{0,1,0,1,0,1,0,1},
4                      {1,0,1,0,1,0,1,0},
5                      {0,1,0,1,0,1,0,1},
6                     {1,0,1,0,1,0,1,0},
7                     {0,1,0,1,0,1,0,1},
8                     {1,0,1,0,1,0,1,0},
9                     {0,1,0,1,0,1,0,1},
10                     {1,0,1,0,1,0,1,0}};
11                    
12        HashMap<Character,Integer>map =new HashMap<>();
13        HashMap<Character,Integer>map1 =new HashMap<>();
14        char c ='a';
15        char b ='1';
16        for(int i=0;i<8;i++){
17            map.put(c,i);
18            map1.put(b,i);
19            c++;
20            b++;
21        }
22        return arr[map.get(s.charAt(0))][map1.get(s.charAt(1))]==1;
23
24
25
26    
27        
28    }
29}