// Last updated: 8/5/2026, 8:53:46 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        HashMap<Character, Integer> map = new HashMap<>();
4
5    for (char c : t.toCharArray()) {
6        map.put(c, map.getOrDefault(c, 0) + 1);
7    }
8
9    for (char c : s.toCharArray()) {
10        map.put(c, map.get(c) - 1);
11    }
12
13    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
14        if (entry.getValue() == 1) {
15            return entry.getKey();
16        }
17    }
18
19    return '\0';
20}
21        
22    }
23