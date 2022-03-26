package basicDataStructure;

public class LC138CopyListWithRandomPointerUsingHashMap {
	public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();
        
        Node copyHead = new Node(-1);
        Node tail = copyHead;
        
        // Create Deep Copy
        Node original = head;
        while(original != null) {
            Node duplicate = new Node(original.val);
            tail.next = duplicate;
            tail = duplicate;
            
            hm.put(original, duplicate);
            original = original.next;
        }
        
        original = head;
        while(original != null) {
            // A --> c
            Node randomNode = original.random;
            if(randomNode != null) {
                // c --> c'
                randomNode = hm.get(randomNode);
            }
            hm.get(original).random = randomNode;
            original = original.next;
        }
        return copyHead.next;
    }
}
