// Last updated: 7/30/2026, 11:01:58 AM
1class Solution {
2    public int missingNumber(int[] a) {
3           Arrays.sort(a);
4
5        for (int i = 0; i < a.length; i++) {
6            if (a[i] != i) {
7                return i;
8            }
9        }
10
11        return a.length;
12        
13    }
14}