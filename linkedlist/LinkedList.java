package eu.aait.linkedlist;

public class LinkedList {
	Node head;
	public void insertatpos(int data, int pos) {
		Node newnode= new Node(data);
		if(pos == 1) {
			newnode.next=head;
			head=newnode;
			return;
		}
		Node temp=head;
		for(int i=0;temp!=null && i<pos-2; i++) {
			temp=temp.next;
			
		}
		if(temp==null) {
			 System.out.println("Position out of range");
	            return;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
	public void deleteatpos(int pos) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		if(pos==1) {
			head=temp.next;
			return;
		}
		for(int i=0;temp!=null &&i<pos-2;i++) {
			temp=temp.next;
		}
		if (temp == null || temp.next == null) {
			System.out.println("Position out of range");
			return;
		}
		temp.next=temp.next.next;
	}
	public void deletafternode(Node prevnode) {
		if(prevnode==null||prevnode.next==null ) {
			System.out.println("the previous node is null");
			return;
		}
		prevnode.next=prevnode.next.next;
			
	}
	public int  searchnode(int value) {
		Node temp = head;
		int pos=1;
		while(temp!=null) {
			if(temp.data==value) {
				return pos;
			}
			temp=temp.next;
			pos++;
		}
		return -1;
	}

	}

