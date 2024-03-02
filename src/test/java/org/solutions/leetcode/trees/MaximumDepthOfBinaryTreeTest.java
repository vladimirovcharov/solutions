package org.solutions.leetcode.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void maxDepth() {
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode node = new TreeNode(3, left, right);

        assertEquals(3, MaximumDepthOfBinaryTree.maxDepth(node));
    }
}