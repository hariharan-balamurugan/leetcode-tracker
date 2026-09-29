// Last updated: 9/29/2026, 1:51:47 PM
1class Solution {
2    public int secondHighest(String s) {
3        
4        HashSet<Integer> set = new HashSet<>();
5
6        for (int i = 0; i < s.length(); i++) {
7            char ch = s.charAt(i);
8
9            if (Character.isDigit(ch)) {
10                set.add(ch - '0');
11            }
12        }
13
14        int max = -1;
15        int second = -1;
16
17        for (int x : set) {
18
19            if (x > max) {
20                second = max;
21                max = x;
22            }
23            else if (x > second && x < max) {
24                second = x;
25            }
26        }
27
28        return second;
29    }
30}