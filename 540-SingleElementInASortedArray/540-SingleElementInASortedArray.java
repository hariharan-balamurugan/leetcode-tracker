// Last updated: 7/23/2026, 2:50:25 PM
class Solution {
    public int singleNonDuplicate(int[] arr) {
        HashMap<Integer,Integer>map =new HashMap<>();
	    for(int i=0;i<arr.length;i++){
	        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	        
	    }int n=0;
	    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
	        if(entry.getValue()==1){
	            n=entry.getKey();
	        }
	    }
	    return n;
	   
        
    }
}