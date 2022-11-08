public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        TreeNode curr = root;
        TreeNode prev = null;

        while (curr != null) {
            if ( prev == null && curr.left != null) {
                root = curr.left;
                curr.left = curr.left.right;
                root.right = curr;
                curr = root;
            }
            else if (curr.left != null) {
                prev.right = curr.left;
                curr.left = curr.left.right;
                prev.right.right = curr;
                curr = prev.right;
            }
            else {
                if (prev != null && prev.val >= curr.val)
                    return false;

                prev = curr;
                curr = curr.right;
            }
        }

        return true;
    }
}
