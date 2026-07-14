// Last updated: 7/14/2026, 2:01:48 PM
class Solution {
    public int longestSubstring(String s, int k) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer>map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char c =s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
                if(isValid(map,k)){
                    max =Math.max(max,j-i+1);

                }
            }
        }
        return max;
        
    }
    static  boolean isValid(HashMap<Character ,Integer>map,int k){
        for( int fre:map.values()){
            if(fre<k){
                return false; 
            }
            
        }
        return true;
    }
}