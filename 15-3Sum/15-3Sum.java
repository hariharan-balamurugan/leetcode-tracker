// Last updated: 8/18/2026, 9:42:12 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] arr) {
3        	ArrayList<List<Integer>>list=new ArrayList<>();
4	
5		int sum=0;
6		Arrays.sort(arr);
7		for(int i=0;i<arr.length-2;i++){
8             if(i > 0 && arr[i] == arr[i - 1]) {
9                continue;
10            }
11		    	int l=i+1;
12	         	int r=arr.length-1;
13	   	while(l<r){
14		    sum=arr[i]+arr[l]+arr[r];
15		    if(sum==0){
16		        list.add(Arrays.asList(arr[i],
17		       arr[l],
18		        arr[r]));
19		        l++;
20		        r--;
21                  while(l < r && arr[l] == arr[l - 1]) {
22                        l++;
23                    }
24
25                   
26                    while(l < r && arr[r] == arr[r + 1]) {
27                        r--;
28                    }
29		    }else if(sum<0){
30		        l++;
31		    }else{
32		        r--;
33		    }
34	         	    
35	         	}
36		}
37        return list;
38        
39    }
40}