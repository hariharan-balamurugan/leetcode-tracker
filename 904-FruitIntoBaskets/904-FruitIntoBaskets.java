// Last updated: 9/11/2026, 12:18:10 PM
1class Solution {
2    public int totalFruit(int[] arr) {
3        HashMap<Integer,Integer>map =new HashMap<>();
4        int r=0;int l=0;int max =0;
5        while(r<arr.length){
6            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
7            while(map.size()>2){
8                map.put(arr[l],map.getOrDefault(arr[l],0)-1);
9               if(map.get(arr[l])==0){
10                map.remove(arr[l]);
11               }
12                l++;
13            }
14            
15                max =Math.max(max,r-l+1);
16                r++;
17            
18        }
19        return max;
20        
21    }
22}