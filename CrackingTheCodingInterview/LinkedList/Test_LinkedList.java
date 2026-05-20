package LinkedList;

public class Test_LinkedList {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Testing LinkedList");
        System.out.println();
        testQ1_RemoveDups();
        testQ2_KthToLastElement();
        testQ3_DeleteMiddleNode();
        testQ8_LoopDetection();
    }


    public static void testQ1_RemoveDups() {
        System.out.println("Testing Q1_RemoveDups");
        LinkedListNode n1 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(2);
        LinkedListNode n3 = new LinkedListNode(3);
        LinkedListNode n4 = new LinkedListNode(2);
        LinkedListNode n5 = new LinkedListNode(4);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        System.out.print("Before: ");
        printList(n1);

        Q1_RemoveDups.removeDups(n1);

        System.out.print("After:  ");
        printList(n1);
        System.out.println();
    }

    public static void testQ2_KthToLastElement() {
        System.out.println("Testing Q2_KthToLastElement");
        LinkedListNode h1 = new LinkedListNode(1);
        LinkedListNode h2 = new LinkedListNode(2);
        LinkedListNode h3 = new LinkedListNode(3);
        LinkedListNode h4 = new LinkedListNode(4);
        LinkedListNode h5 = new LinkedListNode(5);

        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);
        h4.setNext(h5);

        printList(h1);
        LinkedListNode result = Q2_KthToLastElement.getKthToLastElement(h1, 2);
        System.out.println("k=2 -> " + (result != null ? result.data : "null"));
        result = Q2_KthToLastElement.getKthToLastElement(h1, 0);
        System.out.println("k=0 -> " + (result != null ? result.data : "null"));
        System.out.println();
    }

    public static void testQ3_DeleteMiddleNode() {
        System.out.println("Testing Q3_DeleteMiddleNode");
        LinkedListNode a1 = new LinkedListNode(1);
        LinkedListNode a2 = new LinkedListNode(2);
        LinkedListNode a3 = new LinkedListNode(3);
        LinkedListNode a4 = new LinkedListNode(4);

        a1.setNext(a2);
        a2.setNext(a3);
        a3.setNext(a4);

        System.out.print("Before: ");
        printList(a1);

        Q3_DeleteMiddleNode helper = new Q3_DeleteMiddleNode();
        boolean deleted = helper.deleteNode2(a2); // delete the "middle" node by copying next
        System.out.println("deleteNode2 returned: " + deleted);

        System.out.print("After:  ");
        printList(a1);
        System.out.println();
    }

    public static void testQ8_LoopDetection() {
        System.out.println("Testing Q8_LoopDetection");
        LinkedListNode b1 = new LinkedListNode(1);
        LinkedListNode b2 = new LinkedListNode(2);
        LinkedListNode b3 = new LinkedListNode(3);
        LinkedListNode b4 = new LinkedListNode(4);
        LinkedListNode b5 = new LinkedListNode(5);

        b1.setNext(b2);
        b2.setNext(b3);
        b3.setNext(b4);
        b4.setNext(b5);
        // create loop: b5 -> b3
        b5.setNext(b3);

        Q8_LoopDetection ld = new Q8_LoopDetection();
        LinkedListNode loopStart = ld.loopDetected(b1);
        System.out.println("Loop starts at: " + (loopStart != null ? loopStart.data : "null"));
        System.out.println();
    }

    public static void printList(LinkedListNode head) {
        LinkedListNode n = head;
        int count = 0;
        while (n != null && count < 50) {
            System.out.print(n.data + " ");
            n = n.next;
            count++;
        }
        if (n != null) {
            System.out.print("... (truncated)");
        }
        System.out.println();
    }
}
