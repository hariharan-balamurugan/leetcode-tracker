// Last updated: 8/19/2026, 1:49:36 PM
1class Solution {
2    public boolean halvesAreAlike(String str) {
3         str=str.toLowerCase();
4    int mid =str.length()/2;
5
6    int count=0;
7    for(int i=0;i<mid;i++){
8        char c =str.charAt(i);
9        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
10            count++;
11            
12        }
13    }
14    int scount=0;
15    for(int i=mid;i<str.length();i++){
16        char c1=str.charAt(i);
17        if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'){
18            scount++;
19            
20        }
21    }
22    if(count==scount){
23        return true;
24    }
25    return false;
26	    
27        
28    }
29}