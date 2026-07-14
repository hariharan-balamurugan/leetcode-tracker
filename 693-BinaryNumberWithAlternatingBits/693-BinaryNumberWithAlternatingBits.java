// Last updated: 7/14/2026, 2:01:22 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int a=n^(n>>1);
        return (a&(a+1))==0;
        
    }
}