// Last updated: 7/14/2026, 2:04:31 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[]  merge = new int[n+m];
        for(int i=0;i<n;i++){
            merge[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            merge[n+i]=nums2[i];
        }
        Arrays.sort(merge);
        int mid  =merge.length/2;
       double s =0;
       if(merge.length%2!=0){
            return merge[merge.length/2];
       }
       else{
         int a =merge[(merge.length /2)-1];
         int b =merge[merge.length/2];
         return (a+b)/2.0;
         
       }
       
    }
}