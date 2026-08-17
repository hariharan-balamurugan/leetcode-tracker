// Last updated: 8/17/2026, 4:25:57 PM
1class Solution {
2    public boolean canConstruct(String r, String m) {
3        HashMap<Character,Integer>map =new HashMap<>();
4         HashMap<Character,Integer>map1 =new HashMap<>();
5         for(int i=0;i<r.length();i++){
6            char  c =r.charAt(i);
7            map.put(c,map.getOrDefault(c,0)+1);
8
9         }
10          for(int i=0;i<m.length();i++){
11            char  c1 =m.charAt(i);
12            map1.put(c1,map1.getOrDefault(c1,0)+1);
13            
14         }
15        
16         for(char x:map.keySet()){
17            if(!map1.containsKey(x)||map1.get(x)<map.get(x)){
18                return false;
19            }
20         }
21         return true;
22        
23    }
24}