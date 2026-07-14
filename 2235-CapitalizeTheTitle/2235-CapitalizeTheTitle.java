// Last updated: 7/14/2026, 1:59:11 PM
class Solution {
    public String capitalizeTitle(String str) {
        str =str.toLowerCase();
        String w ="";
        str+=" ";
         String result="";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{

                if (w.length() > 2) {
                String first =w.substring(0,1).toUpperCase();
                   w=first+w.substring(1);
                }
                result+=w+" ";

                     w="";
    
              
            }
            
        }
        return result.trim();


        
    }
}