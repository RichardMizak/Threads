package sk.kasv.mizak;

public class MainThread implements Runnable {
    private String threadName;
    private Thread myThread;
    private int priority;

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread " + threadName + " interrupted.");
        }

        System.out.println(threadName + " exiting");
    }

    public MainThread(String threadName, int priority) {
        this.threadName = threadName;
        this.priority = priority;
        System.out.println(threadName + " created");
        }

    public void start() {
        System.out.println("Starting " + threadName);
        if (myThread == null) {
            myThread = new Thread(this, threadName);
            myThread.start();
        }else{
            System.out.println("Error : "+threadName+" is already running.");
        }

    }
    }

