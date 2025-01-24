class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    Counter c;

    public MyThread(Counter c1) {
        c = c1;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("MyThread");
                Thread.sleep(1000);
                c.increment();
            } catch (InterruptedException e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Counter c = new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception occurred while joining threads: " + e.getMessage());
        }

        System.out.println(c.getCount());
    }
}
