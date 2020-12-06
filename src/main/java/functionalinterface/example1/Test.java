package functionalinterface.example1;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running from Runnable Interface");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running from Thread Class");
    }
}

public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);

        MyThread myThread = new MyThread();

        thread1.start();
        myThread.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running thread from anymonous inner class");
            }
        }).start();

        new Thread(()-> System.out.println("Running thread from lamba expression inner class")).start();
    }
}
