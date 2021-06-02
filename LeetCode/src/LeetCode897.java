import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: basics
 * @description: 给你一棵二叉搜索树，请你 按中序遍历 将其重新排列为一棵递增顺序搜索树，
 * 使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
 * @author: 全栈者也
 * @create: 2021 - 04 - 25 10:13
 **/
public class LeetCode897 {

    public static void main(String[] args) {

    }



}

/**
 * 递归
 */
/*class Solution {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        TreeNode dummy = new TreeNode(-1);
        TreeNode cur = dummy;
        for (TreeNode node : list) {
            cur.right = node;
            node.left = null;
            cur = node;
        }
        return dummy.right;
    }
    void dfs(TreeNode root) {
        if (root == null) return ;
        dfs(root.left);
        list.add(root);
        dfs(root.right);
    }
}*/

/**
 * 迭代
 */
/*
class SolutionTwo {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        Deque<TreeNode> d = new ArrayDeque<>();
        while (root != null || !d.isEmpty()) {
            while (root != null) {
                d.add(root);
                root = root.left;
            }
            root = d.pollLast();
            list.add(root);
            root = root.right;
        }
        TreeNode dummy = new TreeNode(-1);
        TreeNode cur = dummy;
        for (TreeNode node : list) {
            cur.right = node;
            node.left = null;
            cur = node;
        }
        return dummy.right;
    }
}*/
