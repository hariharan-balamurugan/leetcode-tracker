// Last updated: 9/17/2026, 2:24:45 PM
1class Solution {
2    public boolean lemonadeChange(int[] arr) {
3        int f=0;
4        int t=0;
5        for(int x:arr){
6            if(x==5){
7                f++;
8            }else if(x==10){
9                if(f<=0){
10                        return false;
11                }
12                f--;
13                t++;
14            }else{
15                if(t!=0&& f!=0){
16                    t--;
17                    f--;
18                }else if(f>=3){
19                        f-=3;
20                    }
21                    else{
22                        return false;
23                    }
24                
25                }
26            }
27            return true;
28        }
29        
30    }
31