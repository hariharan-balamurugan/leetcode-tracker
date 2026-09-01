// Last updated: 9/1/2026, 2:57:01 PM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String[] str =s.split("\\s+");
4        String s1="";
5      for(int i=0;i<str.length;i++){
6        if(i<k){
7            s1+=str[i]+" ";
8
9        }else{
10            break;
11        }
12      }
13      return s1.trim();
14        
15    }
16}