package numbers;

public class Worker {
    boolean flag=false;
    public volatile int value=0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public synchronized void T1() {
        while (value < 1000) {
            if (flag == true) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(value);
            flag = true;
            notify();
        }
    }
    public synchronized void T2() {
        while (value < 1000) {
            if (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(value);
            flag = false;
            notify();
        }
    }
}
