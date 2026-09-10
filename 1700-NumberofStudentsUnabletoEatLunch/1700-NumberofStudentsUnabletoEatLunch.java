// Last updated: 9/10/2026, 9:55:21 AM
1class Solution {
2    public int countStudents(int[] students, int[] s) {
3        Stack<Integer>st =new Stack<>();
4        Queue<Integer>q =new LinkedList<>();
5        for(int i=0;i<students.length;i++){
6            q.offer(students[i]);
7        }
8        for(int i=s.length-1;i>=0;i--){
9            st.push(s[i]);
10        }
11             int c =0;
12        while(!q.isEmpty()&& !st.isEmpty()){
13                    if(q.peek()==st.peek()){
14                        q.poll();
15                        st.pop();
16                        c=0;
17
18                    }else{
19                        q.offer(q.poll());
20                        c++;
21                        if(c==q.size()){
22                            break;
23                        }
24                    }
25                }
26                return q.size();
27            }
28        }
29        
30        
31  