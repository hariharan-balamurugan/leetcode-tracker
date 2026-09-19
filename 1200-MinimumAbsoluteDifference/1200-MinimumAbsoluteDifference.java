// Last updated: 9/19/2026, 11:48:25 AM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        int min=Integer.MAX_VALUE;
5
6      for(int i=0;i<arr.length-1;i++){
7        min=Math.min(min,Math.abs(arr[i]-arr[i+1]));
8      }
9      List<List<Integer>>ans =new ArrayList<>();
10      for(int i=0;i<arr.length-1;i++){
11        List<Integer>cur =new ArrayList<>();
12        if(Math.abs(arr[i]-arr[i+1])==min){
13            cur.add(arr[i]);
14            cur.add(arr[i+1]);
15            ans.add(new ArrayList(cur));
16        }
17      }
18      return ans;        
19    }
20}