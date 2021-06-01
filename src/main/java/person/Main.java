package person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Main main=new Main();
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Adam","Matolak",'m',25));
        personList.add(new Person("Richard","Mizak",'m',20));
        personList.add(new Person("Bram","Stoker",'m',90));
        personList.add(new Person("Chuck","Palahniuk",'m',50));
        personList.add(new Person("Brano","Mojsej",'m',53));
        personList.add(new Person("Zdena","Studenková",'f',10005));
        personList.add(new Person("Tilda","Swinton",'f',46));
        personList.add(new Person("Taika","Waititi",'m',40));
        personList.add(new Person("Flint","Tagart",'m',38));
        personList.add(new Person("Kurt","Matolak",'m',27));

        System.out.println("Full list:");
        personList.forEach(Main::printList);
        System.out.println();
        System.out.println("Sorted by age:");
        sortByAge(personList);
        personList.forEach(Main::printList);
        System.out.println();
        System.out.println("Female list:");
        List<Person> listFemale;
        listFemale= personList.stream().filter( obj ->   obj.getGender()=='f' ).collect(Collectors.toList());
        listFemale.forEach(Main::printList);
        System.out.println();
        System.out.println("Sorted by lname:");
        sortByLname(personList);
        personList.forEach(Main::printList);
        System.out.println();
        System.out.println("Shuffle list:");
        random(personList);
        personList.forEach(Main::printList);
        System.out.println();
        System.out.println("New list:");
        List<Person> newList;
        newList= personList.stream().filter( obj ->   obj.getAge()<=30 ).collect(Collectors.toList());
        newList.forEach(Main::printList);

    }

    private static void printList(Person person) {
        System.out.println(person.getFname()+" "+person.getLname()+" "+person.getGender()+" "+person.getAge());
    }
    private static void sortByAge(List<Person> person) {
        person.sort(Comparator.comparingInt(Person::getAge));
    }
    private static void sortByLname(List<Person> person) {
        person.sort(Comparator.comparing(Person::getLname).thenComparing(Person::getFname));
    }
    private static void random(List<Person> person){
        Collections.shuffle(person);
    }

    }


