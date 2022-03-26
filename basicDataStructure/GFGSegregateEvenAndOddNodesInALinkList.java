package basicDataStructure;

public class GFGSegregateEvenAndOddNodesInALinkList {
	Node divide(int N, Node head){
        // code here
        Node oddHead = new Node(-1);
        Node evenHead = new Node(-1);
        
        Node odd = oddHead, even = evenHead;
        
        while(head != null) {
            if(head.data % 2 == 1) {
                odd.next = head;
                odd = head;
            } else {
                even.next = head;
                even = head;
            }
            head = head.next;
        }
        
        odd.next = null;
        even.next = oddHead.next;
        return evenHead.next;
    }
}
