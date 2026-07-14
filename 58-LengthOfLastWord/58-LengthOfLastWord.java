// Last updated: 7/14/2026, 2:03:32 PM
class Solution {
    public int lengthOfLastWord(String s) {
    s = s.trim();

        String[] words = s.split(" ");
        String lastword = words[words.length - 1];
        int count = lastword.length();
       
      return count;   
    }
   
}