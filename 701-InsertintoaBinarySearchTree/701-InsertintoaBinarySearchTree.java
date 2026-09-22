// Last updated: 9/22/2026, 10:09:03 AM
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if(root==null){
19            return null;
20        }
21        if(key<root.val){
22            root.left =deleteNode(root.left,key);
23        }
24        else if(key>root.val){
25            root.right =deleteNode(root.right,key);
26        }else{
27            if(root.left==null){
28                return root.right;
29            }
30            if(root.right==null){
31                return root.left;
32            }
33           TreeNode ss =root.right;
34            while(ss.left!=null){
35                ss =ss.left;
36            }
37            root.val=ss.val;
38            root.right=deleteNode(root.right,ss.val);
39        }
40        return root;
41        
42    }
43}