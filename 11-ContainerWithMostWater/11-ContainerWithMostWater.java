// Last updated: 7/14/2026, 2:04:21 PM
class Solution {
    public int maxArea(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int max =0;
        while(l<r){
            int minus =Math.abs(l-r);
            int min =Math.min(arr[l],arr[r]);
            max =Math.max(max ,minus*min);
            if(arr[l]<arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
        
    }
}