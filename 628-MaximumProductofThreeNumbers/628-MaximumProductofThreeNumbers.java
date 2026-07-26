// Last updated: 7/26/2026, 6:02:15 PM
1class Solution {
2    public int maximumProduct(int[] arr) {
3    	
4		
5        Arrays.sort(arr);
6        int l=arr[arr.length-1];
7        int sl=arr[arr.length-2];
8        int f =arr[0];
9        int t =arr[1];
10        int n=arr.length;
11        int large=arr[n-1]*arr[n-2]*arr[n-3];
12        int small =arr[0]*arr[1]*arr[n-1];
13        int mul =Math.max(large,small);
14        
15	  
16		   
17		 return mul;   
18		    
19		}
20        
21		 
22		
23        
24        
25    }
26