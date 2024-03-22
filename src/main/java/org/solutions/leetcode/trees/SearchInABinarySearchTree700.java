package org.solutions.leetcode.trees;

public class SearchInABinarySearchTree700 {
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}
