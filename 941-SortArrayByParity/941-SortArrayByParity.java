// Last updated: 7/14/2026, 2:00:37 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {

     int k=0;  
     int[] b=new int[nums.length]; 
    for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            b[k]=nums[i];
            k++;

        }
       
    }	for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				b[k]=nums[i];
				k++;
			}
	}
		
		
  
   return b;
   
}
  
}
