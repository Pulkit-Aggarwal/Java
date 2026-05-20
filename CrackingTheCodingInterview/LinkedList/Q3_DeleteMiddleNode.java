package LinkedList;

public class Q3_DeleteMiddleNode {

    // My understanding was that it is a doubly linked list
    // they want just single list, where we copy the data from the
    // to the current node and then delete the next node
    public void deleteNode(LinkedListNode n) {
        if (n == null || n.next == null || n.prev == null) {
            return;
        }

        n.prev.next = n. next;
        n.next.prev = n.prev;

    }

    // book approach that copies the node and then deletes the next one
    public boolean deleteNode2(LinkedListNode n) {
        if (n == null || n.next == null) {
            return false;
        }

        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
