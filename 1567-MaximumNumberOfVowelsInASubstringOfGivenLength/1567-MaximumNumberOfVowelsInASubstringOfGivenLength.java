// Last updated: 7/14/2026, 1:59:45 PM
class Solution {
    public int maxVowels(String s, int k) {
        
        int left=0;
        int max =Integer.MIN_VALUE;
        int count=0;
     for(int right=0;right<s.length();right++){
         char c= s.charAt(right);
         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
             count++;
         }
         if(right-left+1==k){
             max =Math.max(max,count);
             
             char r =s.charAt(left);
             if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'){
                 count--;
             }
             left++;
         }
         
     }
     return max;
		
    }
}