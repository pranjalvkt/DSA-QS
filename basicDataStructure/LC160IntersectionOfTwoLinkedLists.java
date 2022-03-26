/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
package src.basicDataStructure;

public class LC160IntersectionOfTwoLinkedLists {
	private int getSize(ListNode head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {    
        
        int sizeA = getSize(headA);
        int sizeB = getSize(headB);
        
        if(sizeA > sizeB) {
            for(int i = 0; i < sizeA - sizeB; i++) {
                headA = headA.next;
            }
        } else {
            for(int i = 0; i < sizeB - sizeA; i++) {
                headB = headB.next;
            }
        }
        
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
