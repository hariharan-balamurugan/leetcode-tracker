// Last updated: 9/9/2026, 5:50:59 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        HashMap<Character,Integer>map= new HashMap<>();
4        for(char c:s.toCharArray()){
5            map.put(c,map.getOrDefault(c,0)+1);
6        }
7        int sum=0;
8        int count=0;
9        for( char x:map.keySet()){
10            if(map.get(x)%2!=0){
11                sum+=map.get(x)-1;
12                count++;
13 
14            }else{
15
16                sum+=map.get(x);
17            }
18        }
19        if(count==0){
20            return sum;
21        }else{
22            return sum+1;
23        }
24        
25    }
26}