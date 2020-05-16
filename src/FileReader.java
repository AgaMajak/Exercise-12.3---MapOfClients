import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader {

    public static Map<Integer, Customer> returnMapWithCountries(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        Map<Integer, Customer> mapOfCustomers = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] customerElements = line.split(" ");
            String code = customerElements[0];
            String firstName = customerElements[1];
            String lastName = customerElements[2];
            String phoneNumber = customerElements[3];
            int parseCode = Integer.parseInt(code);
            mapOfCustomers.put(parseCode, new Customer(parseCode, firstName, lastName, phoneNumber));
        }

        scanner.close();
        return mapOfCustomers;

    }
}
