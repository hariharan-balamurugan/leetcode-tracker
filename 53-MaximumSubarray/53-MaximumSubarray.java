// Last updated: 7/14/2026, 2:03:33 PM
class Solution {
    public int maxSubArray(int[] arr) {

         int maxSoFar = arr[0];
        int currSum = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currSum);
        }
        return maxSoFar;
        
    }
}