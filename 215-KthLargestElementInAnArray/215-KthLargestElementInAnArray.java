// Last updated: 7/23/2026, 2:50:42 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            n =nums[nums.length-k];

        }
        return n;
    }
}