// Last updated: 8/24/2026, 2:38:38 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        
7        HashMap<Character,Integer>map =new HashMap<>();
8       for(char c :s.toCharArray()){
9        map.put(c,map.getOrDefault(c,0)+1);
10       }
11       
12       for(char x:t.toCharArray()){
13        if(!map.containsKey(x)){
14            return false;
15        }
16        
17           map.put(x,map.get(x)-1);
18        if(map.get(x)==0){
19            map.remove(x);
20        }
21        
22       }
23       return map.isEmpty();
24
25    }
26}