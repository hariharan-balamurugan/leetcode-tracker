// Last updated: 7/30/2026, 11:44:24 AM
1import java.util.*;
2class Solution {
3    public int[] intersect(int[] arr, int[] arr1) {
4         Arrays.sort(arr);
5	    Arrays.sort(arr1);
6	    int i=0;
7	    int j=0;
8        ArrayList<Integer> list = new ArrayList<>();
9	    while(i<arr.length && j<arr1.length){
10	          if(arr[i]==arr1[j]){
11	              list.add(arr[i]);
12	              i++;
13	              j++;
14	    }else if(arr[i]<arr1[j]){
15	        i++;
16	    }else{
17	        j++;
18	    }
19	        
20	    }
21        int[] result =new int[list.size()];
22        for (int k = 0; k < list.size(); k++) {
23            result[k] = list.get(k);
24}
25return result;
26	  
27        
28    }
29}