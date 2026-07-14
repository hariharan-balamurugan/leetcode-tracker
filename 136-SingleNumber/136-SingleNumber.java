// Last updated: 7/14/2026, 2:03:12 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int n:nums){
            result=result^n;
        }
          return result;
    }
  
    
}