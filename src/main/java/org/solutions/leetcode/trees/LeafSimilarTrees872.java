package org.solutions.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees872 {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = dfs(root1, new ArrayList<>());
        List<Integer> list2 = dfs(root2, new ArrayList<>());

        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        return true;
    }

    private static List<Integer> dfs(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return list;
        }
        if (node.left != null) {
            dfs(node.left, list);
        }
        if (node.right != null) {
            dfs(node.right, list);
        }
        return list;
    }
}
