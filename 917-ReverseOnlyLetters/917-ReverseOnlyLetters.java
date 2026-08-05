// Last updated: 8/5/2026, 2:40:20 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3   char[] arr = s.toCharArray();
4	int i=0;
5	int j=arr.length-1;
6	while(i<j){
7	    
8	    if(Character.isLetter(arr[i]) && Character.isLetter(arr[j])){
9	        char temp =arr[i];
10	        arr[i]=arr[j];
11	        arr[j]=temp;
12	        i++;
13	        j--;
14	    }
15	    else if(!Character.isLetter(arr[i])) {
16	        i++;
17	       
18	    }
19	    else {
20	        j--;
21	    }
22	    
23	}
24	String ans =new String(arr);
25    return ans;
26    }
27}