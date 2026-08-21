// Last updated: 8/21/2026, 12:21:11 PM
1import java.util.*;
2
3class Solution {
4    
5    public String sortVowels(String s) {
6        int count=0;
7        for(int i=0; i<s.length(); i++){
8            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U') {
9                count++;
10			}
11        }
12        char[] v = new char[count];
13        int p=0;
14        for(int i=0; i<s.length(); i++){
15            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U') {
16				v[p++]=s.charAt(i);
17			}
18        }
19        int t=0;
20        char[] cc = s.toCharArray();
21        Arrays.sort(v);
22        for(int i=0; i<s.length(); i++){
23             if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||s.charAt(i)=='U') {
24				cc[i]=v[t++];
25			}
26        }
27        return new String(cc);
28        
29        
30    }
31}