package eu.aait.todolist;

import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ToDoList toDoList = new ToDoList();

	        while (true) {
	            System.out.println("\nSelect an option:");
	            System.out.println("1. Add a new task");
	            System.out.println("2. Mark a task as completed");
	            System.out.println("3. View To-Do List");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter task title:");
	                    String title = scanner.nextLine();
	                    System.out.println("Enter task description:");
	                    String description = scanner.nextLine();
	                    Task newTask = new Task(title, description);
	                    toDoList.addtodo(newTask);
	                    System.out.println("Task added to the to-do list.");
	                    break;
	                case 2:
	                    System.out.println("Enter the title of the task to mark as completed:");
	                    String completedTaskTitle = scanner.nextLine();
	                    toDoList. marktobecompleted(completedTaskTitle);
	                    break;
	                case 3:
	                    toDoList.viewlist();
	                    break;
	                case 4:
	                    System.out.println("Exiting the program.");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }
}
