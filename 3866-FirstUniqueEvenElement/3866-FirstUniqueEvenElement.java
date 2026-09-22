// Last updated: 9/22/2026, 2:06:20 PM
1class Solution {
2    public int firstUniqueEven(int[] nums) {
3        HashMap<Integer,Integer>map=new HashMap<>();
4        for(int x:nums){
5            map.put(x,map.getOrDefault(x,0)+1);
6        }
7        int s =-1;
8        for(int x:nums){
9            if(map.get(x)==1 && x%2==0){
10                return x;
11                
12            }
13        }
14        return -1;
15        
16    }
17}