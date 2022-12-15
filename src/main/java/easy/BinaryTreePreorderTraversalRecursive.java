package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversalRecursive {
    //node left right
    public List<Integer> preorderTraversal(TreeNode root) {
        return dfs(root, new ArrayList<>());
    }

    public List<Integer> dfs(TreeNode root, List<Integer> list) {
        if (root == null) return list;
        list.add(root.val);
        dfs(root.left, list);
        return dfs(root.right, list);
    }
}
