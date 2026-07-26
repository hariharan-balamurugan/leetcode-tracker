// Last updated: 7/26/2026, 9:32:54 PM
1class Solution {
2    public int mostWordsFound(String[] arr) {
3        	//int count=0;
4		int max =0;
5		for(String s:arr){
6		    //System.out.print();
7		    max=Math.max(max,s.split(" ").length);
8		    
9		    
10		}
11		return max;
12		
13        
14    }
15}