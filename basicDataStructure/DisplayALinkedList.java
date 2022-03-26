package basicDataStructure;

public class DisplayALinkedList {
	
	public static class Node {
	    int data;
	    Node next;
	}
	
	public static class LinkedList {
	    Node head;
	    Node tail;
	    int size;
	    
	    void addLast(int val) { 
	    	Node temp = new Node();
    		temp.data = val;
    		temp.next = null;
    		
	    	if(size == 0) {
	    		head = temp;
	    		tail = temp;
	    	} else {
	    		tail.next = temp;
	    		tail = temp;
	    	}
		} 
	    
	    public int size(){
	        return size;
	    }
	    
	    public void display(){
	        Node curr = head;
	        while(curr != null) {
	          System.out.print(curr.data + " ");
	          curr = curr.next;
	        }
	        System.out.println();
	    }
	    
	}
	
	public static void main(String[] args) {

	}

}
