// Last updated: 7/26/2026, 9:04:30 PM
1class Solution {
2    public int maximumCount(int[] arr) {
3        	int pc =0;
4		int nc =0;
5		int max =0;
6		for(int i=0;i<arr.length;i++){
7		    if(arr[i]>0){
8		        pc++;
9		    }
10		    else if(arr[i]<0){
11		        nc++;
12		    }
13		}
14		max =Math.max(pc,nc);
15		return max;
16		
17        
18    }
19}