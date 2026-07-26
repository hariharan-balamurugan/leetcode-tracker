// Last updated: 7/26/2026, 7:19:21 PM
1class Solution {
2    public double findMaxAverage(int[] arr, int k) {
3        int left =0;
4        int sum=0;
5        double avg =0;
6        double max= Integer.MIN_VALUE;
7        for(int right=0;right<arr.length;right++){
8            sum+=arr[right];
9            if(right-left+1==k){
10               avg=(double)sum/k;
11               max =(double)Math.max(max,avg);
12                 sum-=arr[left];
13                 left++;
14            }
15
16
17        }
18        return max;
19        
20    }
21}