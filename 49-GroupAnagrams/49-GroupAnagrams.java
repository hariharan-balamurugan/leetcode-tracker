// Last updated: 7/23/2026, 8:17:15 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        
4        HashMap<String,List<String>>map=new HashMap<>();
5        for(String word:strs){
6            char[] arr =word.toCharArray();
7            Arrays.sort(arr);
8            String  key =new String(arr);
9            if(!map.containsKey(key)){
10               map.put(key,new ArrayList<>());
11            }
12            map.get(key).add(word);
13 
14        }
15        return new ArrayList<>(map.values());
16    }
17}