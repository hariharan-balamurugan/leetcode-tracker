// Last updated: 7/14/2026, 2:04:25 PM
class Solution {
    public boolean ispalindrom(String sub){
        int l=0; int r=sub.length()-1;
        while(l<r){
            if(sub.charAt(l)!=sub.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans ="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub =s.substring(i,j);
                if(ispalindrom(sub)&& ans.length()<sub.length()){
                    ans=sub;
                }
            }
        }
        return ans;
        
    }
}