// Last updated: 9/19/2026, 10:59:34 AM
1class Solution {
2    public int arraySign(int[] arr) {
3        int p=1;
4        int count=0;
5        for(int i=0;i<arr.length;i++){
6            if(arr[i]<0){
7                count++;
8            }
9            if(arr[i]==0){
10                return 0;
11            }
12        }
13        if(count%2!=0){
14            return -1;
15        }
16        return 1;
17       
18    }
19}