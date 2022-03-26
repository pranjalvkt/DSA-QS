package basicDataStructure;

public class GFGCheckIfCircularLinkedList {
	boolean isCircular(Node head)
    {
	    Node slow = head, fast = head;
	    
	    while(fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	        
	        if(slow == fast) {
	            if(slow == head) return true;
	        }
	    }
	    return false;
    }
}
