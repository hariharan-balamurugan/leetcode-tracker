// Last updated: 7/14/2026, 4:42:01 PM
1class Solution {
2    public int minMoves(int[] arr) {
3        
4		int k=0;
5        int min =arr[0];
6		for(int i=0;i<arr.length;i++){
7            if(min>arr[i]){
8                min =arr[i];
9            }
10		}
11		int sum=0;
12		for(int i=0;i<arr.length;i++){
13		     sum+=arr[i]-min;
14		}
15		return sum;
16        
17    }
18}