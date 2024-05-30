package eu.aait.linkedlist;
public class Main {
	public static void main(String[] args) {
	 LinkedList bid = new LinkedList();
     bid.insertatpos(1, 1);
     bid.insertatpos(3, 2);
     bid.deleteatpos(2);
     if (bid.head != null) {
         bid.deletafternode(bid.head);
     }
     System.out.println(bid.searchnode(3));  

     Stack stack = new Stack();
     stack.push(1);
     stack.push(2);
     System.out.println(stack.peak());  
     System.out.println(stack.pop());
}

}
