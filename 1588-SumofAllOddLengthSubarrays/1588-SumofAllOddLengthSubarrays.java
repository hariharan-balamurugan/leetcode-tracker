// Last updated: 9/18/2026, 11:23:31 AM
1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int sum1=0;
4		for(int i=0;i<arr.length;i++){
5		    for(int j=i;j<arr.length;j++){
6		        int count=0;
7		        int sum=0;
8		        for(int k=i;k<=j;k++){
9		            count++;
10		            sum+=arr[k];
11		        }
12		        if(count%2!=0){
13		            sum1+=sum;
14		        }
15		    }      
16		}
17		return sum1;
18	}
19        
20            }
21        