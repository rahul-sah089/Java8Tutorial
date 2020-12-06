package threads;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Running the Thread from Runnable Interface");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Runnind the Thread from  Thread Class");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
