// Last updated: 8/12/2026, 2:19:56 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int[]ans =new int[2];
4        HashMap<Integer,Integer>map =new HashMap<>();
5
6        int r=0;
7        for(int i=0;i<nums.length;i++){
8            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
9
10        }
11        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
12            if(entry.getValue()>1){
13                ans[r++]=entry.getKey();
14                break;
15            }
16        }
17        HashSet<Integer>set=new HashSet<>();
18        for(int i=0;i<nums.length;i++){
19            set.add(nums[i]);
20        }
21        
22        for(int i=1;i<=nums.length;i++){
23            if(!set.contains(i)){
24                      ans[r++]=i;
25            }
26        }
27        return ans;
28    }
29}