package numbers;


public class T1 extends Thread {
    public Worker worker;
    private Thread thread;
    public T2 t2;

    public T1(Worker worker) {
        this.worker = worker;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            worker.setValue(worker.getValue() + 2);
            worker.T1();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public synchronized void start() {
        if (thread == null) {
            thread = new Thread(this, "T1");
            thread.start();
        }
    }
}

