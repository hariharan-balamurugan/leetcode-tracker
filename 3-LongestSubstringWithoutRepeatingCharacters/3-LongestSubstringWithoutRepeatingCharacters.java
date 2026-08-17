// Last updated: 8/17/2026, 11:46:02 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character>set =new HashSet<>();
4        int l=0;
5        int max =0;
6        for(int r=0;r<s.length();r++){
7            while(set.contains(s.charAt(r))){
8                set.remove(s.charAt(l));
9                l++;
10            }
11            set.add(s.charAt(r));
12            max=Math.max(max,r-l+1);
13        }
14        return max;
15
16        
17    }
18}