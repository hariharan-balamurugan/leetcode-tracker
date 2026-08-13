// Last updated: 8/13/2026, 9:43:51 PM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        HashMap<Character,Integer>map =new HashMap<>();
4        for(char c:jewels.toCharArray()){
5            map.put(c,1);
6        }
7        int count=0;
8        for(char c1:stones.toCharArray()){
9            if(map.containsKey(c1)){
10                count++;
11            }
12        }
13        return count;
14    }
15}