package numbers;

public class Worker {
    boolean flag=false;


    public synchronized void T1(int num){
        if (flag==true){
            if (num<1000)
                num=num+2;
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(num);
        flag=true;
        notify();
    }
    public synchronized void T2(int num){
        if (!flag){
            if (num<1000)
                num=num*2;
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(num);
        flag=false;
        notify();
    }
}
