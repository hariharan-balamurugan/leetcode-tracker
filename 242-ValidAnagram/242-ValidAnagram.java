// Last updated: 8/10/2026, 2:27:47 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6    char [] arr =s.toCharArray();
7    char[] arr1=t.toCharArray();
8    Arrays.sort(arr);
9    Arrays.sort(arr1);
10    for(int i=0;i<arr.length;i++){
11        if(arr[i]!=arr1[i]){
12            return false;
13        }
14    }
15    return true;
16        
17        
18    }
19}