// Last updated: 8/11/2026, 1:40:11 PM
1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        HashMap<Integer,Integer>map =new HashMap<>();
4        int n =grid.length;
5        int[] ans =new int[2];
6        int sum =0;
7        int mx=Integer.MIN_VALUE;
8        int mn=Integer.MAX_VALUE;
9        for(int i=0;i<grid.length;i++){
10            for(int j=0;j<grid.length;j++){
11                int val =grid[i][j];
12                sum+=val;
13                map.put(val,map.getOrDefault(val,0)+1);
14            }
15        }
16        int rep=0;
17        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
18            if(entry.getValue()==2){
19                rep =entry.getKey();
20                break;
21
22
23            }
24        }
25        int t =n*n;
26         int es = t * (t + 1) / 2;
27
28        int missing = es- (sum - rep);
29   
30        ans[0]=rep;
31        ans[1]=missing;
32        return ans;
33        
34        
35      
36    }
37}