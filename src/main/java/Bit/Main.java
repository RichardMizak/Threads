package Bit;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Samo", 13587984);

        /*
        int day = scanner.nextInt();
        int mask = (int) Math.pow(2, day - 1);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            int x = entry.getValue() & mask;
            System.out.println(x);
        }
        */
        /*int day2 = scanner.nextInt();
        int mask2 = (int) Math.pow(2, day2 - 1);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            int x = entry.getValue() & mask2;
            System.out.println(x);
            if ((hashMap.get(entry) & mask2) == mask2){
            }else{
                int temp=(mask2 | hashMap.get(entry));
                hashMap.put(String.valueOf(entry), temp);
            }

        }
        */
     /*   for (Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            int x= entry.getValue();
            String[] a=Integer.toBinaryString(x);
            for (int i=0;i<a.length();i++) {
                if (a[i]==0){
                    System.out.println(i);
                }

            }


        }*/
    }
}
