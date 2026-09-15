// Last updated: 9/15/2026, 11:11:32 AM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int ds =0;
4        int s =n;
5        while(s!=0){
6            int l =s%10;
7            ds+=l*l;
8            s/=10;
9
10        }
11        // int s =n;
12        int ss =0;
13         while(n!=0){
14            int l =n%10;
15            ss+=l;
16            n/=10;
17
18        }
19
20    int diff =(ds-ss);
21    if(diff>=50){
22        return true;
23    }
24    return false;
25        
26    }
27}