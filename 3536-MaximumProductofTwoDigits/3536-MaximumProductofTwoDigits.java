// Last updated: 7/25/2026, 9:31:39 AM
1class Solution {
2    public int maxProduct(int n) {
3        int temp=n;
4	    int count=0;
5	    while(temp!=0){
6	        int last =temp%10;
7	        count++;
8	        temp/=10;
9	    }
10	    
11	   
12	    int[] arr =new int[count];
13	    temp=n;
14	    
15	    int k=0;
16	   while(temp>0){
17	       int last =temp%10;
18	       arr[k++]=last;
19	       temp/=10;
20	   }
21	   int mut=0;
22	   int max=0;
23	   for(int i=0;i<arr.length;i++){
24	       for(int j=i+1;j<arr.length;j++){
25	            mut =arr[i]*arr[j];
26	             max =Math.max(max,mut);
27	       }
28	      
29	       
30	       
31	   }
32         return max;
33
34        
35    }
36}