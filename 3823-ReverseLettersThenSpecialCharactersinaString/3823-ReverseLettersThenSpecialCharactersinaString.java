// Last updated: 9/15/2026, 9:30:52 AM
1class Solution {
2    public String reverseByType(String s) {
3        int l=0;
4		int r =s.length()-1;
5		char[] c =s.toCharArray();
6        String res ="";
7		while(l<r){
8		    if(!Character.isLetterOrDigit(c[l])){
9		        l++;
10		        
11		        
12		    }
13		    else if(!Character.isLetterOrDigit(c[r])){
14		        r--;
15		        
16		    }else{
17		      char temp =c[l];
18		        c[l]=c[r];
19		        c[r]=temp;
20		        l++;
21		        r--;
22		        
23		    }
24		}
25		int l1 =0;
26		int r1 =c.length-1;
27		while(l1<r1){
28		    if(Character.isLetterOrDigit(c[l1])){
29		        l1++;
30		        
31		        
32		    }
33		    else if(Character.isLetterOrDigit(c[r1])){
34		        r1--;
35		        
36		    }else{
37		      char temp =c[l1];
38		        c[l1]=c[r1];
39		        c[r1]=temp;
40		        l1++;
41		        r1--;
42		        
43		    }
44		}
45		for(char x:c){
46		    res+=x;
47		}
48        return res;
49	}
50        
51    
52}