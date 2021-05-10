package numbers;

public class Worker {
    boolean flag=false;
    public int value=0;
    public int sum;

    public Worker(int value) {
        this.value = value;
        this.sum = value;
    }

    public synchronized void T1() {
        while (sum < 1000) {
            if (flag == true) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            sum=sum+2;
            System.out.println(sum);
            flag = true;
            notify();
        }
    }
    public synchronized void T2() {
        while (sum < 1000) {
            if (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            sum=sum*2;
            System.out.println(sum);
            flag = false;
            notify();
        }
    }
}
