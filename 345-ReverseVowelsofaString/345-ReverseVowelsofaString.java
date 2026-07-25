// Last updated: 7/25/2026, 2:11:04 PM
1class Solution {
2     static boolean isvoewel(char ch){
3         
4              if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
5                  return true;
6              }
7          
8          return false;
9          
10      }
11    public String reverseVowels(String s) {
12         char[] arr =s.toCharArray();
13	      int l=0;
14	      int r=arr.length-1;
15	      while(l<r){
16	          if(isvoewel(arr[l])&&isvoewel(arr[r])){
17	               char  temp =arr[l];
18	              arr[l]=arr[r];
19	              arr[r]=temp;
20	          }
21	          if(isvoewel(arr[l]) && isvoewel(arr[r])){
22	              l++;
23	              r--;
24	          }
25	          else if(!isvoewel(arr[l])){
26	              l++;
27	              
28	          }else{
29	              r--;
30	          }
31	          
32	      }
33	     String w="";
34	      for(char num:arr){
35	          w+=num;
36	          
37	      }
38	      
39	         
40
41      return w;
42        
43    }
44}