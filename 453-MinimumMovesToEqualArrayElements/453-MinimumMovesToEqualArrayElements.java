// Last updated: 7/23/2026, 2:50:28 PM
class Solution {
    public int minMoves(int[] arr) {
        
		int k=0;
        int min =arr[0];
		for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min =arr[i];
            }
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
		     sum+=arr[i]-min;
		}
		return sum;
        
    }
}