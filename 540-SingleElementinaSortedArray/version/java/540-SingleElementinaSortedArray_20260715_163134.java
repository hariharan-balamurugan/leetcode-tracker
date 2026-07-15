// Last updated: 7/15/2026, 4:31:34 PM
1class Solution {
2    public int singleNonDuplicate(int[] arr) {
3        HashMap<Integer,Integer>map =new HashMap<>();
4	    for(int i=0;i<arr.length;i++){
5	        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
6	        
7	    }int n=0;
8	    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
9	        if(entry.getValue()==1){
10	            n=entry.getKey();
11	        }
12	    }
13	    return n;
14	   
15        
16    }
17}