package extras;

import java.util.Scanner;

class StackClass {
	
	/* static iss liye nhi karege kyuki multiple stack banani hai,
	 *  aur static bna dene se sirf ek class ki stack banegi. */
	private int stack[];
	private int top;
	private int currSize;
	private int capacity;

	public StackClass(int capacity) {
		//size ko hm khud update nhi karege, kyuki push hone pe size badhegi
		this.capacity = capacity;
		this.stack = new int [capacity]; // static way me access karlo, no need of 'this'
		this.top=-1;
	}
	
	public int getSize() {
		return currSize;
	}
	
	public boolean isFull() { 
		return top == capacity-1;
	}

	public boolean isEmpty() { 
		return top == -1;
	}


	public int getTopElement() { 
		return stack[top];
	}

	public int push(int num) { 
		if(isFull()) {
			System.out.println("Stack is full. OverFlow");
		}
		currSize++;
		return stack[++top] = num;
		 // 1- isko change krna
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty: Underflow");
		}
		currSize--;
		return stack[top--];
		
	}
	
	public void printStack() {
		//stack top se print krna chahiye, kyuki access hm top se krte hain na
		for(int i=top; i >= 0; i--) { 
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
}

public class StackClient {
	public static int findMid(StackClass stk) {
		StackClass helperS = new StackClass(stk.getSize());
		int idx = stk.getSize() / 2;
		int mid = 0;
		while(idx-- > 0) {
			helperS.push(stk.pop());
		}
		
		mid = stk.getTopElement();
		while(!helperS.isEmpty()) {
			stk.push(helperS.pop());
		}
		return mid;
	}
	
	public static StackClass getSmallerThanMid(StackClass stk, int capacityOfStack, int mid) {
		StackClass sTM = new StackClass(capacityOfStack);
		while(!stk.isEmpty()) {
			if(stk.getTopElement() < mid) {
				sTM.push(stk.pop());
			} else {
				stk.pop();
			}
		}
		return sTM;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StackClass mainStack = new StackClass(n);
		mainStack.push(10);
		mainStack.push(20);
		mainStack.push(30);
		mainStack.push(40);
		mainStack.push(50);
		System.out.println("Elements present in stack are: ");
		mainStack.printStack();
		int mid = findMid(mainStack);
		System.out.println("Middle element of the stack is: " + mid);
		
		
		StackClass gTMid = getSmallerThanMid(mainStack, n, mid);
		System.out.println("Elements smaller than mid element are: ");
		gTMid.printStack();
		
	}
}
