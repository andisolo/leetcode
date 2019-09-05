/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 *
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/description/
 *
 * algorithms
 * Easy (70.19%)
 * Likes:    342
 * Dislikes: 0
 * Total Accepted:    72.1K
 * Total Submissions: 101.8K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 给定一个二叉树，找出其最大深度。
 * 
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 
 * 说明: 叶子节点是指没有子节点的节点。
 * 
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 返回它的最大深度 3 。
 * 
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] maxDepth = {1};
        maxDepth(maxDepth, 1, root);
        return maxDepth[0];
    }

    private void maxDepth(int[] maxDepth, int depth, TreeNode root) {
        if (root.left != null) {
            maxDepth(maxDepth, depth + 1, root.left);
        }
        if (root.right != null) {
            maxDepth(maxDepth, depth + 1, root.right);
        }
        if (root.left == null && root.right == null) {
            maxDepth[0] = Math.max(maxDepth[0], depth);
        }
    }
}

