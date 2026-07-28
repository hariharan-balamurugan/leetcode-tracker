// Last updated: 7/28/2026, 10:26:19 PM
1class Solution {
2    public int[] twoSum(int[] arr, int t) {
3
4			
5		int l=0;
6		int r=arr.length-1;
7		int start=0;
8		int end=0;
9		while(l<r){
10		    if(arr[l]+arr[r]==t){
11		        start=l;
12		        end=r;
13		        break;
14		        
15		    }else if(arr[l]+arr[r]<t){
16		        l++;
17		    }else{
18		        r--;
19		    }
20		}
21		return new int[]{(start+1),(end+1)};
22
23		
24		
25        
26    }
27}