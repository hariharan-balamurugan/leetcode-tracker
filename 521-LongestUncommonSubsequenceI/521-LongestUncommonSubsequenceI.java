// Last updated: 7/14/2026, 2:01:36 PM
class Solution {
    public int findLUSlength(String a, String b) {
        int max=0;
		if(a.equals(b)) {
			return -1;
		}
		else {
			 max =Math.max(a.length(), b.length());
		}
		return max;
    }
}