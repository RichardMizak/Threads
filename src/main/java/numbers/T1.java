package numbers;


public class T1 implements Runnable {
    private int number;
    private volatile int sum;
    public Worker worker;
    private Thread thread;

    public T1(int number, Worker worker) {
        this.number = number;
        thread = new Thread(this, "t1");
        thread.start();
    }

    @Override
    public void run() {
        sum = number;
    }

    public int getSum() {
        return sum;
    }
}

