// Last updated: 9/3/2026, 4:29:17 PM
1class Solution {
2    public String licenseKeyFormatting(String str, int k) {
3        StringBuilder sb  =new StringBuilder();
4        int count=0;
5        str=str.toUpperCase();
6        for(int i=str.length()-1;i>=0;i--){
7            char c =str.charAt(i);
8            if(c=='-'){
9                continue;
10
11            }
12            if(count==k){
13                sb.append('-');
14                count=0;
15            }
16            count++;
17            sb.append(c);
18            
19            
20
21        }
22        return sb.reverse().toString();
23        
24         
25        
26    }
27}