import java.util.Map;
import java.util.Scanner;

public class CustomerInformation {

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

}
