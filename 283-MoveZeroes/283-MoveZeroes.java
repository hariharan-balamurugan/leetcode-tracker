// Last updated: 7/25/2026, 9:57:32 AM
1class Solution {
2    public void moveZeroes(int[] arr) {
3        int j=0;
4    for(int i=0;i<arr.length;i++){
5        if(arr[i]!=0){
6             int temp =arr[i];
7             arr[i]=arr[j];
8             arr[j]=temp;
9             j++;
10
11        }
12    }
13    for(int i=0;i<arr.length;i++){
14        System.out.print(arr[i]+" ");
15    }
16	}
17}
18        
19    
20