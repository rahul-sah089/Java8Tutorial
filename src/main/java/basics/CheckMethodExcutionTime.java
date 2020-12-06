package basics;

import java.util.concurrent.TimeUnit;

public class CheckMethodExcutionTime {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
        //startTime  = System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(10);
        long endTime = System.nanoTime();
        //endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in Nanosecond : "+timeElapsed);
        System.out.println("Execution time is Millisecond : "+timeElapsed/1000000);
        System.out.println("Execution time is Second : "+(timeElapsed/1000000)/1000);
    }
}
