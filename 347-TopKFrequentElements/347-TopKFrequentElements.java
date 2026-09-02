// Last updated: 9/2/2026, 11:52:58 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3     HashMap<Integer,Integer> map =new HashMap<>();
4     ArrayList<Integer>list =new ArrayList<>();
5     int[] ans =new int[k];
6     Arrays.sort(nums);
7     for(int i=0;i<nums.length;i++){
8        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
9     }
10     int n=0;
11     int c=0;
12     for(int x:map.keySet()){
13       list.add(x);
14     }
15    list.sort((a, b) -> map.get(b) - map.get(a));
16     for(int i=0;i<k;i++){
17        ans[i]=list.get(i);
18     }
19
20         //c=0;
21    
22     return ans;
23        
24    }
25}