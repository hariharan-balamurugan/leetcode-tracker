// Last updated: 7/14/2026, 2:03:38 PM
class Solution {
    public int firstMissingPositive(int[] num) {
        
        int i=0;
        int n=num.length;
        while(i<n){
            int correct =num[i]-1;
            if(num[i]>0 &&num[i]<=n && num[i]!=num[correct]){
                int temp = num[i];
                num[i]=num[correct];
                num[correct]=temp;
            }
            else{
                i++;
            }
        }

        for(i=0;i<n;i++){
            if(num[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}