// Last updated: 8/11/2026, 3:00:50 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer>map=new  HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        int max =   Integer.MIN_VALUE;;
8        int index=0;
9        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
10            if(entry.getValue()>max){
11                 max = entry.getValue();
12                index = entry.getKey();
13            }
14        }
15        return index;
16        
17    }
18}