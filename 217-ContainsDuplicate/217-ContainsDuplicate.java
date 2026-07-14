// Last updated: 7/14/2026, 2:02:31 PM
class Solution {
    public boolean containsDuplicate(int[] arr) {
        	 boolean isdupli = false;
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]==arr[i+1]) {
				 isdupli = true;
				 break;
				 
			 }
		 }
		 return isdupli;
        
    }
}