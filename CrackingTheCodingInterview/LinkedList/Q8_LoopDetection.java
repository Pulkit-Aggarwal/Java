package LinkedList;

public class Q8_LoopDetection {

    public LinkedListNode loopDetected(LinkedListNode head) {
        LinkedListNode slow = head, fast = head;

        /*
        Find meeting point. This will be LOOP_SIZE - k steps into the linked list
         */
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) { // Collision
                break;
            }
        }

        /*
        Error check - no meeting point, and therefore no loop
         */
        if (fast == null || fast.next == null) {
            return null;
        }

        /*
        Move slow to Head. Keep fast at Meeting point.
        Each is k steps away from the start of the loop.
        If they move at the same pace, they must meet at the loop start.
         */
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        /*
        Both now point to the start of the loop.
         */
        return slow;
    }
}
