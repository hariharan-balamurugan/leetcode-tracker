// Last updated: 7/14/2026, 2:03:19 PM
class Solution {
    public void merge(int[] arr, int m, int[] arr2, int n) {
        int[] arr3 = new int[m+n];
        int k=0;
		for(int i=m;i<m+n;i++) {
			arr[i]=arr2[k++];
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		     System.out.print(arr[i]+" ");
		}
	}
        
    }
