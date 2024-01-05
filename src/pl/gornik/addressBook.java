package pl.gornik;

import pl.gornik.person.Employee;
import pl.gornik.person.Familiar;
import pl.gornik.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addressBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();
        persons.add(new Employee("Marian","Ponton","543321321","Sprzątacz"));
        persons.add(new Employee("Grzegorz","Paprykarz","754378422","Woźny"));
        persons.add(new Familiar("Mirosław","Tarczyński","432543123","Wędkarstwo,"));
        persons.add(new Familiar("Jarosław","Pieprzyński","321564233","Gotowanie,Grzybobranie"));

        for(Person person : persons) person.displayInfo();

        System.out.println("----------------------------------------------------");
        System.out.println("Podaj numer osoby w książce adresowej (1-4)");
        int nr = scanner.nextInt();
        scanner.nextLine();
        Person person = persons.get(nr - 1);
        System.out.println("Podaj nowe imię");
        String name = scanner.nextLine();
        System.out.println("Podaj nowe nazwisko");
        String surname = scanner.nextLine();
        System.out.println("Podaj nowy numer telefonu");
        String phoneNumber = scanner.nextLine();

        person.changeAddress(name,surname,phoneNumber);
        person.displayInfo();

    }
}