package basicDataStructure;

public class GFGFindLengthOfLoop {
	static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) break;
        }
        
        if(fast == null || fast.next == null) return 0;
        
        Node curr1 = slow.next;
        int count = 1;
        while(curr1 != slow) {
            count++;
            curr1 = curr1.next;
        }
        return count;
    }
}
