// Last updated: 7/14/2026, 1:58:00 PM
class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        for(int i=0;i<f.length;i++){
            for(int j=0;j<b.length;j++){
                if(f[i]<=b[j]){
                    b[j]=0;
                    break;
                    

                }

            }
        }
        int count=0;
        for(int i=0;i<b.length;i++ ){
            if(b[i]!=0){
                count++;
            }
        }
        return count;        
    }
}