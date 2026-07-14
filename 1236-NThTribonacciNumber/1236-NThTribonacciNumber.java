// Last updated: 7/14/2026, 2:00:21 PM
class Solution {
    public int tribonacci(int n) {
        int f1=0,f2=1,f3=1,f4=0;
        if(n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        while(n-2>0){
            f4=f1+f2+f3;
            f1=f2;
            f2=f3;
            f3=f4;
            n--;
        }return f4;
        
    }
}