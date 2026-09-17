// Last updated: 9/17/2026, 12:34:48 PM
1class Solution {
2       static boolean isvowel(char c ){
3        String v ="aeiou";
4        if(v.indexOf(c)==-1){
5            return false;
6        }
7        return true;
8        
9    }
10    static int iscount(String s){
11        int count=0;
12        for(int i=0;i<s.length();i++){
13            if(isvowel(s.charAt(i))){
14                count++;
15                
16            }
17        }
18        return count;
19    }
20    static String rev(String str){
21        String w ="";
22        for(int i=str.length()-1;i>=0;i--){
23            w+=str.charAt(i);
24        }
25        return w;
26    }
27    
28    public String reverseWords(String str) {
29         String []arr =str.split(" ");
30		    int c =iscount(arr[0]);
31		    String ans =arr[0]+" ";
32		    for(int i=1;i<arr.length;i++){
33		        if(iscount(arr[i])==c){
34		            arr[i]=rev(arr[i]);
35		            
36		        }
37		        ans=ans+arr[i]+" ";
38		    }
39		    return ans.trim();
40        
41    }
42}