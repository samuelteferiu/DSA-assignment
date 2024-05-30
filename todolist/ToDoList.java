package eu.aait.todolist;

public class ToDoList {
	 private Node head;

	    public ToDoList() {
	        this.head = null;
	    }
	    public void addtodo(Task task) {
	    	 Node newnode = new Node(task);
	    	 if(head==null) {
	    		 head=newnode;
	    	 }
	    	 else {
	    		 Node now=head;
	    		 while(now.getNext()!=null) {
	    			 now=now.getNext();
	    		 }
	    		 now.setNext(newnode);
	    	 }
	    }
	    public void marktobecompleted(String title) {
	    	Node now=head;
	    	while(now!=null){
	    		if (now.getTask().gettitle().equals(title)) {
	                now.getTask().markcompleted();
	                return;
	    	}
	    		now = now.getNext();
	    }
	    	 System.out.println("Task can not be  found.");
	    }
	    public void viewlist() {
	    	Node now=head;
	    	 System.out.println("your to do List is:");
	    	 while(now!=null) {
	    		 Task task=now.getTask();
	    		 System.out.println("Title of the task: " + task.gettitle());
	             System.out.println("Description of the task is: " + task.getdiscription());
	             System.out.println("Completed: " + (task.iscompleted() ? "Yes" : "No"));
	             System.out.println("---------------------------");
	             now = now.getNext();
	    	 }
	    }
}
