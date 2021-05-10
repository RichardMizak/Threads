package numbers;


public class T1 extends Thread {
    public Worker worker;
    private Thread thread;


    public T1(Worker worker) {
        this.worker = worker;
        thread=new Thread(this,"T1");
        thread.start();
    }
    @Override
    public void run() {
        worker.T1();
    }

}

