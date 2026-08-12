// Last updated: 8/12/2026, 4:52:06 PM
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        HashMap<Integer,Integer>map =new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        int max =0;
8 int t=0;
9        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
10            if(entry.getValue()>max){
11                max= entry.getValue();
12        
13            }
14         
15        }
16        for(int x:map.keySet()){
17            if(map.get(x)==max){
18                t+=map.get(x);
19            }
20        }
21        return t;
22      
23
24        
25    }
26}