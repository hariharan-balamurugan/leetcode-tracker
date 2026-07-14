// Last updated: 7/14/2026, 1:58:06 PM
class Solution {
    public int findDelayedArrivalTime(int a, int d) {
         int sum =a+d%24;
        if(sum==0){
            return  0; 
        }
        else{
            return sum%24;
        }
        
    }
}