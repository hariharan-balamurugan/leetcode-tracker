// Last updated: 7/23/2026, 3:12:15 PM
class Solution {
    public int[] productExceptSelf(int[] arr) {
        int p[]= new int[arr.length];
        int s[]=new int[arr.length];
        p[0]=1;
        s[arr.length-1]=1;
        for(int i=1;i<arr.length;i++){
            p[i]=p[i-1]*arr[i-1];
        }
        for(int i=arr.length-2;i>=0;i--){
            s[i]=s[i+1]*arr[i+1];
        }
        for(int i=0;i<arr.length;i++){
            p[i]=s[i]*p[i];
        }
        return p;
        
    }
}