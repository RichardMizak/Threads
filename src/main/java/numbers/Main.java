package numbers;

import tutorial.Chat;

public class Main {
    public static void main(String[] args) {
        Worker worker=new Worker();
        new T1(2,worker);
        new T2(worker);
    }
}
