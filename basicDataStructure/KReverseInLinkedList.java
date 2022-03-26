package basicDataStructure;
import java.io.*;
public class KReverseInLinkedList {
	public void kReverse(int k) {
	      // write your code here
	      LinkedList prev = new LinkedList();

	      while(size > 0) {
	        LinkedList curr = new LinkedList();

	        if(size < k) {
	          while(size > 0) {
	            int val = head.data;
	            removeFirst();
	            curr.addLast(val);
	          }
	        } else {
	          for(int i = 0; i < k; i++) {
	            int val = head.data;
	            removeFirst();
	            curr.addFirst(val);
	          }
	        }

	        if(prev.head == null) {
	          prev = curr;
	        } else {
	          prev.tail.next = curr.head;
	          prev.tail = curr.tail;
	          prev.size += curr.size; 
	        }
	      }

	      prev.tail.next = null;
	      head = prev.head;
	      tail = prev.tail;
	      size = prev.size;
	       
	    }
	  }
}
