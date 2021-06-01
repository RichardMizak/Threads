package lambda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=(a,b)->a*b;
        int c=calculator.operation(7,6);
        System.out.println(c);
        calculator=(a,b)->{return a>b?a:b;};
        System.out.println(calculator.operation(7,6));

        Calculator calc2=(a,b)->a-b;
        print(8,19,calc2);

        Tax tax=(tax1 -> tax1*1.22);
        printEurWithTax(20.25,tax);


    }
    private static  void print(int a, int b,Calculator calculator){
        System.out.println(calculator.operation(a,b));
    }
    private static  void printEurWithTax(double value, Tax tax){
        System.out.println(tax.calctTax(value)+" €");

    }
}
