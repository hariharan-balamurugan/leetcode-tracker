// Last updated: 8/23/2026, 7:42:47 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int left=0;
4        int right=nums.length-1;
5       // int[] ans ={-1,-1};
6       int first=-1;
7       int sec=-1;
8        int k=0;
9        while(left<=right){
10            int mid = left+(right-left)/2;
11            if(nums[mid]==target){
12                first=mid;
13                right=mid-1;
14                
15            }else if(nums[mid]<target){
16                left =mid+1;
17            }else{
18                right=mid-1;
19            }
20        }
21
22        left = 0;
23        right = nums.length - 1;
24         while(left<=right){
25            int mid = left+(right-left)/2;
26            if(nums[mid]==target){
27                sec=mid;
28                left=mid+1;
29                
30            }else if(nums[mid]<target){
31                left =mid+1;
32            }else{
33                right=mid-1;
34            }
35        }
36        return new int[]{first,sec};
37       
38        
39    }
40}