package project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = ed.nextInt();
            ed.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = ed.nextLine();
                    Task task = new Task(description);
                    toDoList.addTask(task);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    System.out.print("Enter index of task to mark as completed: ");
                    int index = ed.nextInt();
                    toDoList.markTaskAsCompleted(index - 1); // Adjusting index to 0-based
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }

}
