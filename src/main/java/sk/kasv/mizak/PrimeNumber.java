package sk.kasv.mizak;

public class PrimeNumber extends Thread{
    private String threadName;
    private int baseNumber;
    private Thread myThread;
    private int prime;

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        int limit = 1;
        for(int i=baseNumber; i < (long)Math.pow(baseNumber,2); i++){
            boolean isPrime = true;
            for(int j=2; j < i ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
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
