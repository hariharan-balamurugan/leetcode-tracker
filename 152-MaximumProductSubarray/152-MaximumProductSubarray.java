// Last updated: 7/14/2026, 2:03:11 PM
class Solution {
    public int maxProduct(int[] arr) {
        int max =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
            int pro =1;
			for(int j=i;j<arr.length;j++) {
				
					//System.out.print(arr[k]);2,3,-2,4
					pro*=arr[j];
			
				if(pro>max) {
					max =pro;
				}
				
				
			}
		}return max;
		

        
    }
}