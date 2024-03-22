package org.solutions.leetcode.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SearchInABinarySearchTree700Test {

    @Test
    void test() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode node = SearchInABinarySearchTree700.searchBST(root, 2);
        TreeNode expectedNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertEquals(expectedNode.val, node.val);
        assertEquals(expectedNode.left.val, node.left.val);
        assertEquals(expectedNode.right.val, node.right.val);
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode node = SearchInABinarySearchTree700.searchBST(root, 5);
        assertNull(node);
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode node = SearchInABinarySearchTree700.searchBST(root, 7);
        TreeNode expectedNode = new TreeNode(7);
        assertEquals(expectedNode.val, node.val);
        assertEquals(expectedNode.left, node.left);
        assertEquals(expectedNode.right, node.right);
    }
}