package ua.andriy.danilevskyy.hillel.phonebook;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Record("andy", "111"));
        phoneBook.add(new Record("andy", "112"));

        Record ololo = phoneBook.find("andy");
        System.out.println("Record: " + ololo.getName() + " " + ololo.getPhoneNumber());

        phoneBook.getPrint();
    }
}
