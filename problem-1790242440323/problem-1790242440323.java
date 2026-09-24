// Last updated: 9/24/2026, 3:04:00 PM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int  a =nums[i];
5            int s =0;
6            while(a>0){
7                int l=a%10;
8                s+=l;
9                a/=10;
10                
11            }
12            if(s==i){
13                return i;
14            }
15        }
16        return -1;
17        
18    }
19}