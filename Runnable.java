package arraylist;

//1. Create a "task" by implementing the Runnable interface
class MyTask implements Runnable {

 // 2. Put the code you want the thread to run inside the run() method
 @Override
 public void run() {
     for (int i = 0; i < 5; i++) {
         System.out.println("Runnable task: " + i);
         try {
             // Pauses this thread to let the other thread run
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

//Renamed class from 'Thread' to 'ThreadDemo' to avoid conflict
public class ThreadDemo {

 public static void main(String[] args) {
     // 3. Create an instance of your task
     MyTask tt = new MyTask();

     // 4. Create a Thread and pass your task to it
     Thread th = new Thread(tt);

     // 5. Start the new thread by calling start() on the Thread object
     th.start(); // This was the main fix (was tt.start())

     // The main thread continues its own work
     for (int i = 0; i < 5; i++) {
         System.out.println("Main Thread: " + i);
         try {
             // Pauses the main thread
             Thread.sleep(500);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}
