// Last updated: 9/12/2026, 2:11:45 PM
1class Solution {
2    public int sumDivisibleByK(int[] nums, int k) {
3        HashMap<Integer,Integer>map =new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6
7        }
8        int sum =0;
9        int m=0;
10        for(int x:map.keySet()){
11            if(map.get(x)%k==0){
12                m=x*map.get(x);
13                sum+=m;
14                
15
16            }
17        }
18        return sum;
19        
20    }
21}