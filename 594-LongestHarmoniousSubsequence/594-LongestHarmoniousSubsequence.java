// Last updated: 8/12/2026, 12:36:12 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        HashMap<Integer,Integer>map =new HashMap<>();
4        
5       // Arrays.sort(nums);
6        int max =nums[nums.length-1];
7        int min=nums[0];
8        int sum=0;
9        for(int i=0;i<nums.length;i++){
10            
11            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
12        }
13        for(int x:map.keySet()){
14            if(map.containsKey(x+1)){
15                sum=Math.max(sum,map.get(x)+map.get(x+1));
16            }
17           
18            
19        }
20        return sum;
21
22        
23    }
24}