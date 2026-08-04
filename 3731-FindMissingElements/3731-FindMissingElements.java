// Last updated: 8/4/2026, 11:57:56 AM
1class Solution {
2    public List<Integer> findMissingElements(int[] arr) {
3          Arrays.sort(arr);
4	    int max=arr[arr.length-1];
5	    int min =arr[0];
6        int index=0;
7        List<Integer> ans = new ArrayList<>();
8
9	     for (int i = min; i <= max; i++) {
10            if (index < arr.length && arr[index] == i) {
11                index++;
12            } else {
13                ans.add(i);
14               
15            }
16        }
17         return ans;
18    }
19}