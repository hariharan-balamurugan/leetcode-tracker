// Last updated: 9/8/2026, 11:49:06 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character>set =new HashSet<>();
4        int l=0;
5        int max=0;
6        for(int r =0;r<s.length();r++){
7            while(set.contains(s.charAt(r))){
8                set.remove(s.charAt(l));
9                l++;
10            }
11
12            set.add(s.charAt(r));
13            max=Math.max(max,r-l+1);
14            
15        }
16        return max;
17        
18    }
19}