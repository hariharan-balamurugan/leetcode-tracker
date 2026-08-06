// Last updated: 8/6/2026, 2:23:57 PM
1class Solution {
2    public int findNonMinOrMax(int[] arr) {
3         Arrays.sort(arr);
4	   int max =arr[arr.length-1];
5	   int min  =arr[0];
6	  // int[] arr1 =new int[2];
7	   int k=0;
8	   int start =-1;
9	   
10	    for(int i=0;i<arr.length;i++){
11	        if(arr[i]==max){
12	            continue;
13	        }
14	        if(arr[i]==min){
15	            continue;
16	        }
17	        else if(arr[i]!=min &&arr[i]!=max){
18	            start=arr[i];
19	            break;
20	            
21	        }
22	    }
23	    if(start==-1){
24	        return -1;
25	    }
26	    return start;
27	    
28	}
29        
30    }
31