// Last updated: 8/18/2026, 11:28:52 AM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int[] temp=new int[nums.length];
4        ArrayList<Integer>list =new ArrayList<>();
5        int n =nums.length;
6       // int x=0;
7       // k=k%n;
8        for(int i=0;i<nums.length;i++){
9            temp[(i+k)%n]=nums[i];
10        }
11       
12        for (int i = 0; i < n; i++) {
13            nums[i] = temp[i];
14        }
15        
16    }
17}