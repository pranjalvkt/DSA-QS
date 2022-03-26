package basicDataStructure;
import java.util.*;
public class UnfoldOfLinkedlist {
	public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void unfold(ListNode head) {
        ListNode fHead = new ListNode(-1);
        ListNode sHead = new ListNode(-1);
        
        ListNode fTail = fHead, sTail = sHead;
        
        while(head != null) {
            fTail.next = head;
            fTail = head;
            head = head.next;
            
            if(head != null) {
                sTail.next = head;
                sTail = head;
                head = head.next;
            }
        }
        
        fTail.next = null;
        sTail.next = null;
        
        fTail.next = reverse(sHead.next);
        head = fHead.next;
    }

    static ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;
        
        while(curr != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }
        scn.close();
        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}
