package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {
	
	
	

	// Task class represents individual tasks in the to-do list
	
	    private String description;
	    private boolean completed;

	    public Task(String description) {
	        this.description = description;
	        this.completed = false;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public boolean isCompleted() {
	        return completed;
	    }

	    public void setCompleted(boolean completed) {
	        this.completed = completed;
	    }

	    @Override
	    public String toString() {
	        return (completed ? "[X] " : "[ ] ") + description;
	    }
	}

	// To-Do List class manages the list of tasks
	class ToDoList {
	    private ArrayList<Task> tasks;

	    public ToDoList() {
	        this.tasks = new ArrayList<>();
	    }

	    public void addTask(Task task) {
	        tasks.add(task);
	    }

	    public void markTaskAsCompleted(int index) {
	        if (index >= 0 && index < tasks.size()) {
	            Task task = tasks.get(index);
	            task.setCompleted(true);
	            System.out.println("Task marked as completed: " + task.getDescription());
	        } else {
	            System.out.println("Invalid task index!");
	        }
	    }

	    public void displayTasks() {
	        System.out.println("To-Do List:");
	        for (int i = 0; i < tasks.size(); i++) {
	            System.out.println((i + 1) + ". " + tasks.get(i));
	        }
	    }
	}

	

