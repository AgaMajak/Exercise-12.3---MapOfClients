import java.util.Map;
import java.util.Scanner;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Customer(int id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public static void printInfoWithIDFromUser(Map<Integer, Customer> map) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ID klienta, aby wyświetlić informacje o nim.");
        int id = scan.nextInt();
        scan.close();

        if (map.get(id) == null) {
            System.out.println("Nie ma klienta o takim ID.");
            return;
        }
        System.out.println(map.get(id));
    }

    @Override
    public String toString() {
        return String.format("Id klienta: %d. Dane osobowe: %s %s, nr telefonu: %s.\n", id, firstName, lastName, phoneNumber);
    }

}


