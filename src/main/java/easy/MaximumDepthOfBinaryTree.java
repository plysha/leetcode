package easy;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}


class MaximumDepthOfBinaryTreeBFSIterative {
    /*public int maxDepth(TreeNode root) {
        //todo

    }*/
}
