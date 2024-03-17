package org.solutions.leetcode.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.solutions.leetcode.trees.ValidateBinarySearchTree98.isValidBST;

class ValidateBinarySearchTree98Test {

    @Test
    void testValidBST() {
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertTrue(isValidBST(node));
    }

    @Test
    void testValidBST2() {
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        assertTrue(isValidBST(node));
    }

    @Test
    void testNotValidBST() {

        TreeNode node = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        assertFalse(isValidBST(node));
    }
}