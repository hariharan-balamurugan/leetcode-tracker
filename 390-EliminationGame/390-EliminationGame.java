// Last updated: 9/22/2026, 11:22:25 AM
1class Solution {
2    public int lastRemaining(int n) {
3        return solve(n,1,1,true);
4        
5    }
6    int solve(int n,int head,int st,boolean left){
7        if(n==1){
8            return head;
9        }
10        if(left||n%2==1){
11            head+=st;
12        }
13        return solve(n/2,head,st*2,!left);
14    }
15}