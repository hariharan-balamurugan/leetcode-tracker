// Last updated: 7/14/2026, 2:03:17 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int currentgas =0;
        int total =0;
        for(int i=0;i<gas.length;i++){
            int gain =gas[i]-cost[i];
            currentgas+=gain;
            total+=gain;
            if(currentgas<0){
                start=i+1;
                currentgas=0;
            }
        }
        if(total>=0){
            return start;
        }
        else{
            return -1;
            
        }
        


        
    }
}