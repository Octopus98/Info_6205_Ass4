import java.util.*;
public class BSTIterator {
    private Queue<Integer> items;

    public BSTIterator(TreeNode root) {
        items = new LinkedList<>();
        travers(root);
    }

    private void travers(TreeNode node) {
        if (node != null) {
            travers(node.left);
            items.add(node.val);
            travers(node.right);
        }
    }

    public int next() {
        return items.poll();
    }

    public boolean hasNext() {
        return items.peek() != null;
    }
}
