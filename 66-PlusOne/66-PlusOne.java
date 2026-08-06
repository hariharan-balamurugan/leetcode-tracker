// Last updated: 8/6/2026, 2:43:49 PM
1class Solution {
2    public int[] plusOne(int[] digit) {
3        for(int i=digit.length-1;i>=0;i--){
4            if(digit[i]<9){
5                digit[i]++;
6                return digit;
7
8            }
9            digit[i]=0;
10
11        }
12        int []res =new int[digit.length+1];
13        res[0]=1;
14        return res;
15        
16    }
17}