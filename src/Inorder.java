public class Inorder {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (p.right != null)
            return leftMost(p.right);

        TreeNode successor = null;
        while (root != null) {
            if (root.val == p.val)
                return successor;
            if (root.val > p.val) {
                successor = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return successor;
    }

    private TreeNode leftMost(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
}
