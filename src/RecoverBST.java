public class RecoverBST {
    private TreeNode first, second ,pre;

    public void recoverTree(TreeNode root) {
        first = null; second = null; pre = null;
        inorder(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);

        if(first==null && (pre==null ||pre.val>=root.val)){
            first = pre;
        }
        if(first!=null && pre.val>=root.val){
            second = root;
        }
        pre = root;
        inorder(root.right);
    }
}
