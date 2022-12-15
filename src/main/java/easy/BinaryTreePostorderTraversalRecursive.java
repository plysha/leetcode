package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversalRecursive {
    public List<Integer> postorderTraversal(TreeNode root) {
        //left right node
        return dfs(root, new ArrayList<>());
    }

    private List<Integer> dfs(TreeNode root, List<Integer> list) {
        if (root == null) return list;
        dfs(root.left, list);
        dfs(root.right, list);
        list.add(root.val);
        return list;
    }
}
