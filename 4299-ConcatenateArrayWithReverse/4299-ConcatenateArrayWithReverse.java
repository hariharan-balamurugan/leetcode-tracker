// Last updated: 7/14/2026, 1:57:48 PM
class Solution {
    public int[] concatWithReverse(int[] arr) {
        int[] arr2 = new int[arr.length];

        int k = 0;

        for(int i = arr.length - 1; i >= 0; i--) {
            arr2[k++] = arr[i];
        }

        int[] arr3 = new int[arr.length + arr2.length];

        k = 0;   // Important

        for(int i = 0; i < arr.length; i++) {
            arr3[k++] = arr[i];
        }

        for(int i = 0; i < arr2.length; i++) {
            arr3[k++] = arr2[i];
        }
        return arr3;

        
    }
}