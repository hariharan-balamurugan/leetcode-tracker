// Last updated: 8/21/2026, 1:59:41 PM
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] arr, int e) {
3          ArrayList<Boolean>a =new ArrayList<>();
4          int max =0;
5	    for(int i=0;i<arr.length;i++){
6            max =Math.max(max,arr[i]);
7
8	       
9	        
10	    }
11        for(int i=0;i<arr.length;i++){
12            
13
14	        if(max<=(arr[i]+e)){
15	            a.add(true);
16	        }else{
17	            a.add(false);
18	        }
19	        
20	    }
21        return a;
22        
23    }
24}