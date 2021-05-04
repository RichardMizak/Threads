package sk.kasv.mizak;

public class Main {
    public static void main(String[] args) {
        MainThread th1=new MainThread("Thread 1",1);
        th1.start();
        MainThread th2=new MainThread("Thread 2",10);
        th2.start();
    }
}
