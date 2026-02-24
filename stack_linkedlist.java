import java.util.*;
// Linked list implementation of stack
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    Node top;
    int size;
    Stack(){
        this.top = null;
        this.size = 0;
    }
    
    public void Push(int value){
        Node newnode = new Node(value);
        if(this.top == null){
            this.top = newnode;
        }
        else{
            newnode.next = this.top;
            this.top = newnode;
        }
        this.size += 1;
    }
    
    public void Pop(){
        if(this.top == null){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Poped " + (this.top.data) + " from stack");
            this.top = this.top.next;
            this.size -= 1;
        }
    }
    
    public void Clear(){
        this.top = null;
    }
}

public class stack_linkedlist{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		while(true){
		    System.out.println("0 - Exit");
		    System.out.println("1 - Top");
		    System.out.println("2 - Push");
		    System.out.println("3 - Pop");
		    System.out.println("4 - Size");
		    System.out.println("5 - Clear");
		    int n = sc.nextInt();
		    if(n == 0){
		        break;
		    }
		    else if(n == 1){
		        if(st.top == null){
		            System.out.println("Stack is empty");
		        }
		        else{
		            System.out.println("top = " + st.top.data);
		        }
		    }
		    else if(n == 2){
		        System.out.println("Enter the value ");
		        int value = sc.nextInt();
		        st.Push(value);
		        System.out.println("Pushed " + value + " into the stack");
		    }
		    else if(n == 3){
		        st.Pop();
		    }
		    else if(n == 4){
		        System.out.println("Size = " + st.size);
		    }
		    else if(n == 5){
		        st.Clear();
		        System.out.println("Stack cleared");
		    }
		}
	}
}
