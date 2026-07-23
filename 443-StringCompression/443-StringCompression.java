// Last updated: 7/23/2026, 2:50:29 PM
class Solution {
    public int compress(char[] arr) {
        int index =0;
	    int i=0;
	    while(i<arr.length){
	        int count=0;
	        char current =arr[i];
	        while(i<arr.length&&arr[i]==current){
	            count++;
	            i++;
	        }
	        arr[index++]=current;
	         
	        if(count>1){
	            String countstr =String.valueOf(count);
	            for(char c : countstr.toCharArray()){
	                arr[index++]=c;
	            }
	        }
	    }
        return index;
        
    }
}