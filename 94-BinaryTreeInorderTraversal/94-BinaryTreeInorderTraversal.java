// Last updated: 9/21/2026, 12:36:51 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17     void inorder(TreeNode root,List<Integer>list ){
18        if(root==null){
19            return  ;
20        }
21       inorder(root.left,list);
22        list.add(root.val);
23        inorder(root.right,list);
24    }
25
26    public List<Integer> inorderTraversal(TreeNode root) {
27        List<Integer>list =new ArrayList<>();
28        inorder(root,list);
29        return list;
30
31
32        
33    }
34}