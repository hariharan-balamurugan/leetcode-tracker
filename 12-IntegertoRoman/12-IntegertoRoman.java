// Last updated: 9/9/2026, 12:15:33 PM
1class Solution {
2    public String intToRoman(int num) {
3        String [] s ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
4        int[] v ={1,4,5,9,10,40,50,90,100,400,500,900,1000};
5        StringBuilder sb =new StringBuilder();
6        for(int i=v.length-1;i>=0;i--){
7            while(num>=v[i]){
8                sb.append(s[i]);
9                num-=v[i];
10
11            }
12        }
13        return sb.toString();
14
15        
16    }
17}