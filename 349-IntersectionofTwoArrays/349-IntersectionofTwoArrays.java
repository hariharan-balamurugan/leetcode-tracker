// Last updated: 7/28/2026, 9:51:28 PM
1class Solution {
2    public int[] intersection(int[] arr, int[] arr1) {
3        HashSet<Integer>hs=new HashSet<>();
4       HashSet<Integer>hs1=new HashSet<>();
5       for(int i=0;i<arr.length;i++){
6           hs.add(arr[i]);
7       }
8       int count=0;
9       ArrayList<Integer>list =new ArrayList<>();
10       for(int i=0;i<arr1.length;i++){
11           if(hs.contains(arr1[i])){
12               hs1.add(arr1[i]);
13     
14           }
15       }
16     int[] ans = new int[hs1.size()];
17
18     int i = 0;
19
20     for (int num : hs1) {
21         ans[i] = num;
22               i++;
23         }
24
25       return ans; 
26    }
27}