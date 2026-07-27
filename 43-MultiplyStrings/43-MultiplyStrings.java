// Last updated: 7/27/2026, 12:36:36 PM
1import java.math.BigInteger;
2
3class Solution {
4    public String multiply(String num1, String num2) {
5        BigInteger n1 = new BigInteger(num1);
6        BigInteger n2 = new BigInteger(num2);
7
8        return n1.multiply(n2).toString();
9    }
10}