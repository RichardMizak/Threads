package person;

public class Person {
    private String fname;
    private String lname;
    private char gender;
    private  int age;

    public Person(String fname, String lname, char gender, int age) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    private int getHashCode(){
        int hc=0;
        String vowels="aeiouy";
        for (int i=0;i<lname.length();i++){
            char temp=lname.toLowerCase().charAt(i);
            if (!vowels.contains(String.valueOf(temp))){
                hc+=Math.pow(2,(lname.length()-i-1));
            }
        }
        return hc;
    }
}
