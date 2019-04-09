package pl.tomaszmalinowski.udemy.clasandobject;

public class Invoice {

    public static void main(String[] args) {


        calculateTax();
        setCustamerData();
        printCustomerData();



    }

    private static void calculateTax() {
    }

    private static void setCustamerData() {

        Customer customer4 = new Customer("Jan", "Nowak", "5832969085", "test@test.pl", "ZFRT");
        Address customer4Address = new Address("Gdynia", "81-456", "Zwycięstwa", "245");

    }

    private static void printCustomerData () {
        System.out.println();
    }


}
