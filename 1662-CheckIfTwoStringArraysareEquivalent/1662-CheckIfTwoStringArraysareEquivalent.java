// Last updated: 9/28/2026, 10:53:27 PM
1class Solution {
2    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
3         String str1 ="";
4	 String str2="";
5	 
6	 for(String s:word1){
7	     str1+=s;
8	 }
9	//System.out.print(str1);
10	for(String s1:word2){
11	     str2+=s1;
12	 }
13	
14	
15	if(str1.equals(str2)){
16        return true;
17	}
18    return false;
19	}
20        
21    }
22