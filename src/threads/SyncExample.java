package threads;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;

class MyThread extends Thread {
	
    List<Integer> list;

    public MyThread(String name, List<Integer> list) {
        super(name); // Set the thread's name
        this.list = list; // Initialize the shared list
    }

    @Override
    public void run() {
        System.out.println("Running: " + this.getName() + " - " + this.getState()); // Print thread name and state
        
        synchronized (list) { // Synchronize on the shared list
            insertNextId(list); // Insert next ID in a synchronized block
        }

        insertNextId(this.list); // Insert next ID outside the synchronized block

        System.out.println("Exiting: " + this.getName() + " - " + this.getState()); // Print thread exiting state
    }

    static synchronized private void insertNextId(List<Integer> list) {
        int max = 0; // Initialize maximum value
        
        for (int num : list) { // Iterate through the list
            if (num > max) {
                max = num; // Find maximum value in the list
            }
        }
        
        list.add(++max); // Add next integer (max + 1) to the list
    }
}

public class SyncExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState()); // Print main thread state

        List<Integer> list = new CopyOnWriteArrayList<>(List.of(5, 1, 4, 3, 6, 2)); // Initialize list with values

        MyThread t1 = new MyThread("T-1", list); // Create thread T-1
        System.out.println("Running: " + t1.getName() + " - " + t1.getState()); // Print T-1 state

        System.out.println("Before: " + list); // Print list before thread execution
        
        t1.start(); // Start the thread
        t1.join(); // Wait for the thread to complete

        System.out.println("After: " + list); // Print list after thread execution

        System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState()); // Print main thread state
    }
}
