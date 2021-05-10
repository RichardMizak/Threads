package numbers;



public class T2 extends Thread {
    public Worker worker;
    private Thread thread;
    public T1 t1;

    public T2(Worker worker, T1 t1) {
        this.worker = worker;
        this.t1 = t1;
    }

    @Override
    public synchronized void start() {
        try {
            worker.setValue(worker.getValue()*2);
            System.out.println(worker.getValue());
            wait();
            synchronized (this.t1){
                this.t1.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        if (thread == null) {
            thread = new Thread(this, "T2");
            thread.start();
        }
    }
}


