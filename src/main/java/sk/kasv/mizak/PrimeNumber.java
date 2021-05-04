package sk.kasv.mizak;

public class PrimeNumber extends Thread{
    private String threadName;
    private int baseNumber;
    private Thread myThread;
    private int prime;

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        boolean flag = false;
        for (int i=2;i<baseNumber/2;i++){
            if (baseNumber%i==0){
                flag=true;
                break;
            }
        }
        if (!flag)
            System.out.println(baseNumber+" is a prime number.");
        else
            System.out.println(baseNumber+" is not a prime number.");
        System.out.println(threadName + " exiting");
    }

    public PrimeNumber(String threadName, int baseNumber) {
        this.threadName = threadName;
        this.baseNumber = baseNumber;
        System.out.println(threadName + " created");
    }
    @Override
    public void start() {
        if (myThread == null) {
            myThread = new Thread(this, threadName);
            myThread.start();
        }else{
            System.out.println("Error : "+threadName+" is already running.");
        }

    }
}
