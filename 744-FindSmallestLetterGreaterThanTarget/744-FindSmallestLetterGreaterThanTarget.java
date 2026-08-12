// Last updated: 8/12/2026, 2:35:23 PM
1class Solution {
2    public char nextGreatestLetter(char[] arr, char target) {
3        for(int i=0;i<arr.length;i++){
4            char s=arr[i];
5            if(s<=target){
6                continue;
7            }
8            return arr[i];
9
10        }
11        return arr[0];
12
13        
14    }
15}