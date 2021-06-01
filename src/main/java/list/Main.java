package list;

import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(21);
        list.add(98794);
        list.add(87);
        list.add(2);
        list.add(98);
        list.add(2654);
        List<String> names=new ArrayList<>();
        names.add("Adam");
        names.add("Brano");
        names.add("Riso");
        Main main=new Main();
        // 1;
        for(int i=0;i< list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        // 2;
        System.out.print(list);
        System.out.println();
        // 3;
        for (Integer i:list) {
            System.out.print(i+" ");
        }
        System.out.println();
        // 4;
        Iterator<Integer> integerIterator=list.iterator();
        while(integerIterator.hasNext()) {
            System.out.print(integerIterator.next()+" ");
        }
        System.out.println();
        // 5;
        list.forEach((n)->{
            System.out.print(n+" ");
        });
        System.out.println();
        // 6.
        list.forEach(Main::write);
        System.out.println();
        list.forEach(Main::power);
        System.out.println();
        list.sort(Comparator.naturalOrder());
        list.forEach((n)->{
            System.out.print(n+" ");
        });

        System.out.println();
        Collections.sort(list,reverseOrder());
        list.forEach((n)->{
            System.out.print(n+" ");
        });

        System.out.println();
        Collections.sort(list,(o1, o2) -> {
            int num1=main.digitSum(o1);
            int num2=main.digitSum(o2);
            return num1-num2;
        });
        System.out.println(list);

        System.out.println();
        Collections.sort(list,(o1, o2) -> {
            int num1=main.digitSum(o1);
            int num2=main.digitSum(o2);
            return num1-num2;
        });
        System.out.println(list);

        names.sort(Comparator.reverseOrder());
        names.forEach((n)->{
            System.out.print(n+" ");
        });

    }
        int digitSum(int value) {
            int temp = 0;
            while (value != 0){
            temp += value%10;
            value /= 10;
        }
            return temp;

    }
    static void write(int n){
        System.out.print(n+" ");
    }
    static void power(int n){
        System.out.print(n*n+" ");
    }
}
