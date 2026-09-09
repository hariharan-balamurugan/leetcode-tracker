// Last updated: 9/9/2026, 2:08:31 PM
1class Solution {
2
3    public boolean checkPerfectNumber(int num) {
4        int sum=0;
5        for(int i=1;i<num;i++){
6            if(num%i==0){
7                sum+=i;
8            }
9        }
10        if(sum==num){
11            return true;
12        }
13        return false;
14
15        
16    }
17}