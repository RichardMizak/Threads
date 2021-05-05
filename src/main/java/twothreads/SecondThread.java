package twothreads;

public class SecondThread extends Thread{
    private Thread thread;
    @Override
    public void run() {
    try {
        System.out.println("2");
        Thread.sleep(500);
        System.out.println("2.1");
        synchronized (this){
            notify();
        }
}catch (InterruptedException e){
    e.printStackTrace();
}
    }

    @Override
    public synchronized void start() {
        if (thread==null){
            thread=new Thread(this,"secondThread");
            thread.start();
        }
    }
}
