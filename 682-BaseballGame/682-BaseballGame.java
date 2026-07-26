// Last updated: 7/26/2026, 6:50:38 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer>s=new Stack<>();
4        int sum=0;
5         for(String num:operations){
6           
7            if (!num.equals("C") && !num.equals("D") && !num.equals("+")){
8                s.push(Integer.parseInt(num));
9            }
10            else if(num.equals("C")){
11                s.pop();
12            }
13            else if(num.equals("D")){
14                int prod=s.peek()*2;
15                s.push(prod);
16            }
17            else if(num.equals("+")){
18               int first = s.pop();
19               int second = s.peek();
20               s.push(first);
21               s.push(first + second);
22                   
23            }
24         }
25         for(int x:s){
26            sum+=x;
27         }
28         return sum;
29
30        
31    }
32}