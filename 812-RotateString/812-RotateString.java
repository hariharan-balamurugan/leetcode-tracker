// Last updated: 7/14/2026, 2:00:45 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String temp =s+""+s;
        if(temp.contains(goal)){
            return true;
        }
        return false;
    }
}