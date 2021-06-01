package numbers;

public class T2 extends Thread {
    public Worker worker;
    private Thread thread;


    public T2(Worker worker) {
        this.worker = worker;
        thread=new Thread(this,"T2");
        thread.start();
    }
    @Override
    public void run() {
       worker.T2();
    }
}


