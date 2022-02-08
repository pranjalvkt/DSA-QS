class MyCircularDeque {
    int front = 0,rear = 0;
    int size = 0;
    int[] arr;
    public MyCircularDeque(int k) {
        arr = new int[k];
    }
    
     //front pe operation ho rha to front pointer kaam aayega
    public boolean insertFront(int value) { //front pe already hai to peechhe jao
        if(isFull()) return false;
        front = (front - 1 + arr.length) % arr.length;
        arr[front] = value;
        size++;
        return true;
    }
    
    // rear pe kaam ho rha to rear pointer kaam aayega
    public boolean insertLast(int value) { // rear pe directly daal do
        if(isFull()) return false;
        arr[rear] = value;
        rear = (rear + 1) % arr.length;
        size++;
        return true;
    }
    
    //front pe operation ho rha to front pointer kaam aayega
    public boolean deleteFront() { // front jisse point kar rha usse hta do
        if(isEmpty()) return false;
        int val = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return true;
    }
    
    // rear pe kaam ho rha to rear pointer kaam aayega
    public boolean deleteLast() { // rear empty pe hai, peechhe krke delete kardo
        if(isEmpty()) return false;
        rear = (rear - 1 + arr.length) % arr.length;
        int val = arr[rear];
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return arr[front];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        int temp = (rear - 1 + arr.length) % arr.length;
        return arr[temp];
    }
    
    public boolean isEmpty() {
        if(size == 0) return true;
        return false;
    }
    
    public boolean isFull() {
        if(size == arr.length) return true;
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */