// Last updated: 9/15/2026, 12:33:51 PM
1class Solution {
2    public String orderlyQueue(String s, int k) {
3        if(k==1){
4            String ans =s;
5            for(int i=1;i<s.length();i++){
6                String temp =s.substring(i)+s.substring(0,i);
7                if(temp.compareTo(ans)<0){
8                    ans =temp;
9                }
10            }
11            return ans;
12        }
13        char[] c =s.toCharArray();
14        Arrays.sort(c);
15        String str ="";
16        for(char x:c){
17            str+=x;
18        }
19
20        return str;
21        
22    }
23}