// Last updated: 8/24/2026, 1:42:12 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int s =0;
4        int p=1;
5        int x=n;
6
7        while(x>0){
8            int last=x%10;
9            s+=last;
10            p*=last;
11            x/=10;
12
13        }
14        if(n%(s+p)==0){
15            return true;
16        }
17        return false;
18        
19    }
20}