// Last updated: 9/18/2026, 2:47:12 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        HashMap<Character,Character>map =new HashMap<>();
7        HashSet<Character>set =new HashSet<>();
8        for(int i=0;i<s.length();i++){
9            char c =s.charAt(i);
10            char c1 =t.charAt(i);
11            if(map.containsKey(c)){
12                if(!map.get(c).equals(c1)){
13                    return false;
14                }
15            }
16            else{
17                if(set.contains(c1)){
18                    return false;
19                }
20                map.put(c,c1);
21                set.add(c1);
22            }
23        }
24        return true;
25
26        
27    }
28}