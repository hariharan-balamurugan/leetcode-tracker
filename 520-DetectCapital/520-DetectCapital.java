// Last updated: 7/14/2026, 2:01:42 PM
class Solution {
    public boolean detectCapitalUse(String str) {
        int upper =0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                upper++;

            }
        }
        if(upper==str.length()){
            return true;
        }
        else if(upper==0){
            return true;  
        }
        else if(upper==1 && Character.isUpperCase(str.charAt(0))){
            return true;
        }
         
            return false;
    
        
    }
}