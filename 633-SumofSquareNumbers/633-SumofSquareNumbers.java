// Last updated: 9/20/2026, 7:47:32 PM
1class Solution {
2    
3    public boolean isPerfectSquare(int num) {
4        if(num==1){
5            return true;
6        }
7        int l=1;
8        int r=num/2;
9        while(l<=r){
10            int m =(l+r)/2;
11            long s =(long)m*m;
12            if(s==num){
13                return true;
14            }else if(s>num){
15                r=m-1;
16            }else{
17                l=m+1;
18            }
19        }
20        return false;
21        
22    }
23}