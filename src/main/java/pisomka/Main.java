package pisomka;

public class Main {
    public static void main(String[] args) {
        String name = "RichardMizak";
        String hc = "";
        for (int i = 0; i < name.length(); i++) {
            char temp = name.toLowerCase().charAt(i);
            if (temp == 'b' || temp == 'c' || temp == 'd' || temp == 'f' || temp == 'g' || temp == 'j' || temp == 'k'||
                    temp == 'l'|| temp == 'm'|| temp == 'n'|| temp == 'p'|| temp == 'r'|| temp == 's'|| temp == 't'||
                    temp == 'q'|| temp == 'v'|| temp == 'w'|| temp == 'z') {
                hc += 0;
            } else {
                hc += 1;
            }
        }
        System.out.println(hc);
        int hash=Integer.parseInt(hc,2);
        System.out.print(hash);
    }
    }

