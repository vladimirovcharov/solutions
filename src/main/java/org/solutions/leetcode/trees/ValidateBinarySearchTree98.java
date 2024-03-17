package org.solutions.leetcode.trees;

public class ValidateBinarySearchTree98 {
    static boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private static boolean isValidBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
