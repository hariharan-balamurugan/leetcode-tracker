// Last updated: 8/7/2026, 4:23:22 PM
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int n=s.length();
4
5        int arr[]=new int[n];
6        for(int i=0;i<s.length();i++){
7            arr[i]=Integer.MAX_VALUE;
8        }
9        for(int i=0;i<s.length();i++){
10            if(s.charAt(i)!=c){
11                continue;
12            }
13            else{
14                for(int j=s.length()-1;j>=0;j--){
15                    arr[j]=Math.min(arr[j],Math.abs(j-i));
16                }
17            }
18        }
19      return arr;
20        }
21
22       
23    }
24