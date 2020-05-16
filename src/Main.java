import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "Customer.txt";
        File file = new File(fileName);

        Map<Integer, Customer> mapOfCustomers = FileReader.returnMapWithCountries(file);

        System.out.println(mapOfCustomers.keySet());
        System.out.println(mapOfCustomers.values());

        CustomerInformation.printInfoWithIDFromUser(mapOfCustomers);

    }
}
