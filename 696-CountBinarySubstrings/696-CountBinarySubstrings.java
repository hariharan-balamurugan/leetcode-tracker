// Last updated: 7/14/2026, 2:01:18 PM
class Solution {
    public int countBinarySubstrings(String s) {
        int pre=0;
        int cur=1;
        int ans =0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cur++;
            }else{
                ans+=Math.min(pre,cur);
                pre=cur;
                cur=1;

            }
        }
        return ans+=Math.min(pre,cur);
        
    
    }
}