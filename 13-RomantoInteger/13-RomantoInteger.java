// Last updated: 9/9/2026, 11:38:23 AM
1class Solution {
2
3    
4    public int romanToInt(String s) {
5       HashMap<Character,Integer>map =new HashMap<>();
6        map.put('I',1);
7        map.put('V',5);
8        map.put('X',10);
9        map.put('L',50);
10        map.put('C',100);
11        map.put('D',500);
12        map.put('M',1000);
13        int n=0;
14        int sum=0;
15        for(int i=0;i<s.length();i++){
16            int c=map.get(s.charAt(i));
17            if(i<s.length()-1 && c<map.get(s.charAt(i+1))){
18                sum-=c;
19            }else{
20                sum+=c;
21            }
22        }
23        return sum;
24        
25    }
26}