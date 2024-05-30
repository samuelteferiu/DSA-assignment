package eu.aait.linkedlist;

public class Stack {
	Node head;
public void push(int data) {
	Node newnode = new Node(data);
	newnode.next=head;
	head =newnode;
	}
public int pop() {
	if(head==null){
		  System.out.println("Stack is empty");
          return -1;
	}
	int popp=head.data;
	head=head.next;
	return popp;
}
public int peak() {
	if(head==null) {
		 System.out.println("Stack is empty");
         return -1;
	}
	return head.data;
}
}

