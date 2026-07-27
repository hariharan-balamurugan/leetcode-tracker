// Last updated: 7/27/2026, 9:17:04 PM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3
4		int index =0;
5		for(int i=0;i<word.length();i++){
6		   index= word.indexOf(ch);
7		    
8		    
9		}
10		String str =word.substring(0,index+1);
11		String rev ="";
12		for(int i=str.length()-1;i>=0;i--){
13		       rev+=str.charAt(i);
14		}
15		String ruslt =rev+word.substring(index+1);
16        return ruslt;
17		
18	}
19        
20    }
21