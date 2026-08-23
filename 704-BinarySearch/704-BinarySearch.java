// Last updated: 8/23/2026, 7:19:42 PM
1class Solution {
2    public int search(int[] arr, int t) {
3        	int left=0;
4		int right=arr.length-1;
5		int in=0;
6		while(left<=right){
7	     	int mid =left+(right-left)/2;
8		    if(arr[mid]==t){
9		      return mid;
10		       // return;
11		        
12		    }else if(arr[mid]<t){
13		        left=mid+1;
14		    }else{
15		        right=mid-1;
16		    }
17		}
18        return -1;
19		
20	}
21}
22