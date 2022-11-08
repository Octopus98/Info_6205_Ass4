public class RangeSum {
    private int rangeSum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {

        if(root == null) return 0;

        rangeSumBST(root.left,low,high);

        if(root.val >= low && root.val <= high) {
            rangeSum += root.val;
        }

        rangeSumBST(root.right,low,high);

        return rangeSum;
    }
}
