package pl.gornik.person;

public class Employee extends Person{
    private String Position;

    public Employee(String name, String surname, String phoneNumber, String position) {
        super(name, surname, phoneNumber);
        this.Position = Position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pracownik: " + getName() + " " + getSurname() + "Num. telefonu: " + getPhoneNumber() + "Stanowisko: " + Position );
    }
}
