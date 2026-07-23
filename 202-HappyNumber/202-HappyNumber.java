// Last updated: 7/23/2026, 8:52:43 PM
1class Solution {
2    public boolean isHappy(int n) {
3        HashSet<Integer>set=new HashSet<>();
4        
5        while(n!=1 && !set.contains(n)){
6            set.add(n);
7            int sum=0;
8            while(n>0){
9                int last=n%10;
10                sum+=last*last;
11                n/=10;
12            }
13            n=sum;
14        }
15        if(n==1){
16            return true;
17        }
18        
19        return false;
20        
21    }
22}