// Last updated: 7/23/2026, 3:13:01 PM
class Solution {
    public int search(int[] nums, int target) {
        int index=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
            }
        }
        if(index!=-1){
            return index;
        }
        return index;
        
    }
}