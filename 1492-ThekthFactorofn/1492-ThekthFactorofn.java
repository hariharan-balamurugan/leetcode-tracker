// Last updated: 9/28/2026, 6:00:27 PM
1class Solution {
2    public int kthFactor(int n, int k) {
3        ArrayList<Integer>list =new ArrayList<>();
4		for(int i=1;i<=n;i++){
5		    if(n%i==0){
6		        list.add(i);
7		    }
8		}
9		int ans =0;
10	     for(int i=0;i<list.size();i++){
11	         if(i+1==k){
12	             ans =list.get(i);
13	         }
14	     }
15	     if(ans==0){
16	         return -1;
17	     }
18	         return ans;
19	     
20	     
21        
22    }
23}