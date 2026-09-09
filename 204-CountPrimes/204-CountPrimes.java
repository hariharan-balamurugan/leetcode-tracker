// Last updated: 9/9/2026, 2:39:23 PM
1class Solution {
2    public int countPrimes(int n) {
3        	int count=0;
4      //  n=(int)Math.sqrt(n);
5      boolean[] isprime = new boolean[n];
6
7        Arrays.fill(isprime, true);
8
9        //traverse untill sqrt(n)
10        for (int i = 2; i * i < n; i++) {
11
12            if (isprime[i] == true) {
13
14                // i's multiples can't be a prime number
15                for (int j = i * i; j < n; j = j + i) {
16
17                    isprime[j] = false;
18
19                }
20
21            }
22
23        }
24	
25		for(int i=2;i<n;i++){
26		    if(isprime[i]==true){
27		        count++;
28		    }
29		}
30		return count;
31        
32    }
33}