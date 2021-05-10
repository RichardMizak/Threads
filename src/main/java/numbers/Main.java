package numbers;

import tutorial.Chat;

public class Main {
    public static void main(String[] args) {
    Worker worker=new Worker();
    worker.setValue(5);
    T1 t1=new T1(worker);
    t1.start();
    T2 t2=new T2(worker,t1);
    t2.start();
    }
}
