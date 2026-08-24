// Last updated: 8/24/2026, 11:53:15 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer>set=new HashSet<>();
4        if (nums == null || nums.length == 0) return 0;
5        for(int num:nums){
6            set.add(num);
7        }
8        int max=0;
9
10        for(int num:set){
11           if(!set.contains(num-1)){
12            int cm=num;
13            int cl=1;
14            while(set.contains(cm+1)){
15                cm++;
16                cl++;
17
18            }
19            max =Math.max(max,cl); 
20           }
21
22        }
23        return max;
24        
25    }
26}