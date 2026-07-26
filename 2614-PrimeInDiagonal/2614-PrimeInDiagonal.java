// Last updated: 7/26/2026, 8:58:23 PM
1class Solution {
2     static boolean isprime(int num){
3         if(num<=1){
4             return false;
5         }else{
6             for(int i=2;i*i<=num;i++){
7                 if(num%i==0){
8                     return false;
9                 }
10             }
11            
12         }
13          return true;
14         
15     }
16    
17    public int diagonalPrime(int[][] arr) {
18                 int max =0;
19		  for(int i=0;i<arr.length;i++){
20		      int num=arr[i][i];
21		      if(isprime(arr[i][i])&& arr[i][i]>max ){
22		          max =arr[i][i];
23		      }
24		      
25		  }
26		  
27		   for(int i=0;i<arr.length;i++){
28		       int num=arr[i][arr.length-1-i];
29		       if(isprime(arr[i][arr.length-1-i])&& arr[i][arr.length-1-i]>max ){
30		          max =num;
31		      }
32		      
33		       
34		       
35		   }
36           return max;
37        
38    }
39}