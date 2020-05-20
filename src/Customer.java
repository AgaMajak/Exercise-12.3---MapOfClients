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

    @Override
    public String toString() {
        return String.format("Id klienta: %d. Dane osobowe: %s %s, nr telefonu: %s.\n", id, firstName, lastName, phoneNumber);
    }

}


