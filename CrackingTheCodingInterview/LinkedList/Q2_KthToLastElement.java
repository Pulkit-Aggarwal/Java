package LinkedList;

public class Q2_KthToLastElement {
    
    public static LinkedListNode getKthToLastElement(LinkedListNode head, int k) {
        
        int counter = k; 
        LinkedListNode list = head;
        while (list != null) {
            if (counter == 0) {
                head = head.next;
                list = list.next;
            } else {
                list = list.next;
                counter--;
            }
        }
        
        
        return head;
    }
}
