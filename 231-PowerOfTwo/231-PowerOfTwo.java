// Last updated: 7/14/2026, 2:02:24 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
             if(n == 0) return false;
        while(n != 1)
        {
           if(n % 2 == 0)
                n/=2;
            else 
                break;
        }

        return n == 1;
    }
}