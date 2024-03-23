package org.solutions.leetcode.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeafSimilarTrees872Test {

    @Test
    void testTrue() {
        TreeNode root1 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(9), new TreeNode(8)));

        TreeNode root2 = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));

        assertTrue(LeafSimilarTrees872.leafSimilar(root1, root2));
    }

    @Test
    void testFalse() {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        TreeNode root2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));

        assertFalse(LeafSimilarTrees872.leafSimilar(root1, root2));
    }
}