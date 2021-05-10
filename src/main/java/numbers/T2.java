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
            Thread.sleep(1000);
            worker.setValue(worker.getValue() * 2);
            worker.T2();
        }catch (InterruptedException e){
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


