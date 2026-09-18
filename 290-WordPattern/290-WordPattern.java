// Last updated: 9/18/2026, 11:46:34 AM
1class Solution {
2    public boolean wordPattern(String p, String s) {
3        String []word =s.split(" ");
4        HashMap<Character,String>map =new HashMap<>();
5        HashSet<String>set =new HashSet<>();
6        if(p.length()!=word.length){
7            return false;
8        }
9
10        for(int i=0;i<p.length();i++){
11            char c =p.charAt(i);
12            String w =word[i];
13            if(map.containsKey(c)){
14                if(!map.get(c).equals(w)){
15                    return false;
16                }
17            }else{
18                if(set.contains(w)){
19                    return false;
20                }
21                map.put(c,w);
22                set.add(w);
23            }
24
25
26        }
27        return true;
28        
29    }
30}