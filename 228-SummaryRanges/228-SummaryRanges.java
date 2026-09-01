// Last updated: 9/1/2026, 12:26:00 PM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        List<String>list =new ArrayList<>();
4        HashSet<Long>set =new HashSet<>();
5        for(long x:nums){
6            set.add(x);
7        }
8        int c =0;
9        for(int i=0;i<nums.length;i++){
10            c++;
11            if(!set.contains((long)nums[i]+1)){
12                if(c==1){
13                    list.add(String.valueOf(nums[i]));
14                }else{
15                    int n=Math.abs(c-i-1);
16                    String s =nums[n]+"->"+nums[i];
17                    list.add(s);
18                }
19                c=0;
20            }
21        }
22        return list;
23        
24    }
25}