// Last updated: 7/14/2026, 2:01:44 PM
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

        }
        int index=0;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(map.get(c)==1){
                index=i;
                break;
            }else{
                index=-1;
            }
        }
        return index;
        
    }
}