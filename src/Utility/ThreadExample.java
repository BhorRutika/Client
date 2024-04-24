// Thread class
package Utility;

class MyThread extends Thread {
    public void run() {
        // Your thread logic goes here
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class ThreadExample {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread thread = new MyThread();

        // Start the thread
        thread.start();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print a message after the thread completes
        System.out.println("Main thread exiting");
    }
}
