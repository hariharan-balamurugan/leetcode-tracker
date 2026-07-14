// Last updated: 7/14/2026, 2:03:42 PM
class Solution {
    public void nextPermutation(int[] arr) {
        int index = -1;

        // Step 1: Find pivot
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                index = i - 1;
                break;
            }
        }

        // If already last permutation
        if (index == -1) {
            Arrays.sort(arr);
        } else {

            // Step 2: Find smallest element greater than pivot
            int ind = index + 1;

            for (int i = index + 1; i < arr.length; i++) {
                if (arr[i] > arr[index] && arr[i] <= arr[ind]) {
                    ind = i;
                }
            }

            // Swap
            int temp = arr[index];
            arr[index] = arr[ind];
            arr[ind] = temp;

            // Step 3: Reverse suffix
            int left = index + 1;
            int right = arr.length - 1;

            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
    
