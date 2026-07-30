// Last updated: 7/30/2026, 1:56:35 PM
1class Solution {
2    public int findContentChildren(int[] arr, int[] arr1) {
3         int count=0;
4	    int i=0;
5	    int j=0;
6	    Arrays.sort(arr);
7        Arrays.sort(arr1);
8	    while(i<arr.length && j<arr1.length){
9	        if(arr1[j]>=arr[i]){
10	            count++;
11	            i++;
12	            j++;
13	            
14	        }else{
15	            j++;
16	        }
17	        
18	    }
19	 return count;
20	   
21	    
22        
23    }
24}