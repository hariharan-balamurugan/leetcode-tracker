// Last updated: 10/1/2026, 3:07:38 PM
1class Solution {
2    public int countWords(String[] words1, String[] words2) {
3        HashMap<String,Integer>map=new HashMap<>();
4        HashMap<String,Integer>map2 =new HashMap<>();
5        for(String s:words1){
6            map.put(s,map.getOrDefault(s,0)+1);
7        }
8         for(String s:words2){
9            map2.put(s,map2.getOrDefault(s,0)+1);
10        }
11        int count=0;
12       
13       for(String x:map.keySet()){
14          if(map2.containsKey(x) && map.get(x)==1 && map2.get(x)==1){
15            count++;
16          }
17       }
18       return count;
19        
20    }
21}