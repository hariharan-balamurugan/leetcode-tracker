// Last updated: 9/10/2026, 11:46:18 AM
1class Solution {
2    public int maxScore(int[] c, int k) {
3        int left =0;
4        int sum=0;
5        int min=Integer.MAX_VALUE;
6        int t=0;
7         int w = c.length - k;
8        for(int x:c){
9            t+=x;
10        }
11        if(w==0){
12            return t;
13        }
14        for(int r =0;r<c.length;r++){
15            sum+=c[r];
16            if(r-left+1==w){
17               min=Math.min(min,sum);
18                sum-=c[left];
19                left++;
20            }
21        }
22        return t-min;
23        
24    }
25}