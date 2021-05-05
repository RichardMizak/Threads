package twothreads;

public class FirstThread extends Thread {
    private Thread thread;


    @Override
    public void run() {
        try {
            System.out.println("1");
            Thread.sleep(500);
            System.out.println("1.1");
            synchronized (this){
                notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void start() {
        if(thread==null){
            thread=new Thread(this,"firstThread");
            thread.start();
        }
    }
}
