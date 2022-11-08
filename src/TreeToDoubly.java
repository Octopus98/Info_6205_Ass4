public class TreeToDoubly {
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;

        Node dummy = new Node(-1);
        prev = dummy;

        treeToDoubly(root);

        Node head = dummy.right;
        head.left = prev;
        prev.right = head;
        return head;
    }


    Node prev, next;
    private void treeToDoubly(Node root) {
        if (root == null) return;

        treeToDoubly(root.left);

        prev.right = root;
        root.left = prev;
        prev = root;

        treeToDoubly(root.right);
    }
}
