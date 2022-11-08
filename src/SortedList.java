
public class SortedList {

    public TreeNode sortedListToBST(ListNode head) {

        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        int[] arr = new int[size];
        temp = head;
        int cntr = 0;
        while(temp != null){
            arr[cntr++] = temp.val;
            temp = temp.next;
        }
        return solve(arr,0,size - 1);
    }

    public TreeNode solve(int[] arr,int start,int end){

        if(start > end){
            return null;
        }

        int mid = start + (end - start)/2;

        TreeNode node = new TreeNode(arr[mid]);

        node.left = solve(arr,start,mid - 1);
        node.right = solve(arr,mid + 1,end);

        return node;
    }

}
