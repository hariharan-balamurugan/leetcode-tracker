// Last updated: 7/23/2026, 2:50:46 PM
class Solution {
    public String reverseWords(String str) {

	    str=str.replaceAll("\\s+"," ");
	    String[]arr =str.split(" ");
        String w="";
	    for(int i=arr.length-1;i>=0;i--){
            w+=arr[i]+" ";
	         
	        
	        }
            w=w.trim();
            return w;
        
        
    }
}