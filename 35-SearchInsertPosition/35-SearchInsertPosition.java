// Last updated: 7/30/2026, 9:18:31 AM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left =0;
4        int right =nums.length-1;
5        int index =0;
6
7        
8                  while(left<=right){
9                        int mid =left+(right-left)/2;
10                         if(nums[mid]==target){
11                             return mid;
12                          //reak;
13                        }
14                        else if(nums[mid]<target){
15                              left=mid+1;
16                         }else{
17                            right=mid-1;
18                          }
19        
20                       }
21            
22            
23        
24        return left;
25    }
26}