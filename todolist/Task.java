package eu.aait.todolist;

public class Task {
	private String title;
	private String discription;
	private boolean completed;
	public Task(String title, String discription) {
		this.title=title;
		this.discription=discription;
		this.completed=false;
	}
public String gettitle() {
	return title;
}
public String getdiscription() {
	return discription;
}
public boolean iscompleted() {
	return completed;
}
public void markcompleted() {
	this.completed=true;
}
}
