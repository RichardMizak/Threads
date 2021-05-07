package numbers;

public class T2 implements Runnable{
    private int number;
    private volatile int sum;
    public Worker worker;
    private Thread thread;

    public T2(Worker worker) {
        this.worker = worker;
        thread=new Thread(this,"t2");
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


