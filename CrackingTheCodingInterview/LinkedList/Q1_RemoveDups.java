package LinkedList;

import java.util.HashSet;

//TODO: Test this before you commit to github 

public class Q1_RemoveDups {

   public static void removeDups(LinkedListNode n) {
       HashSet<Integer> set = new HashSet<Integer>();
       LinkedListNode previous = null;
       while(n != null) {
           if(set.contains(n.data)) {
               previous.next = n.next;
           } else {
               set.add(n.data);
               previous = n;
           }
           n = n.next;
       }
   }
}
