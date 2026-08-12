// Last updated: 8/12/2026, 3:13:24 PM
1class Solution {
2    public int sumOfUnique(int[] arr) {
3        HashMap<Integer,Integer>map=new HashMap<>();
4        int sum=0;
5        for(int i=0;i<arr.length;i++){
6            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
7        }
8        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
9            if(entry.getValue()==1){
10                sum+=entry.getKey();
11            }
12        }
13        return sum;
14        
15    }
16}