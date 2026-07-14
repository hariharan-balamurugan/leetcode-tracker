// Last updated: 7/14/2026, 2:01:29 PM
class Solution {
    public boolean ispalindrome(String sub){
        int l=0;int r=sub.length()-1;
        while(l<r){
            if(sub.charAt(l)!=sub.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub =s.substring(i,j);
                if(ispalindrome(sub)){
                    count++;
                }
            }
        }
        return count;
        
    }
}