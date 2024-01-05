package pl.gornik.person;

public class Familiar extends Person {
    private String Interests;

    public Familiar(String name, String surname, String phoneNumber, String interests) {
        super(name, surname, phoneNumber);
        Interests = interests
        ;
    }

    @Override
    public void displayInfo() {
        System.out.println("Znajomy: " + getName() + " " + getSurname() + "Num. telefonu: "
                + getPhoneNumber() + "Zainteresowania: " + Interests );
    }
}
