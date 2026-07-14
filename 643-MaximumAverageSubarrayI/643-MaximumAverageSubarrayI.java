// Last updated: 7/14/2026, 2:01:30 PM
class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];

        }
        int max = sum;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            max = Math.max(sum,max);
        }
        double avg =(double)max/k;

        //System.out.print(avg);
        return avg;
    }
        
   
}