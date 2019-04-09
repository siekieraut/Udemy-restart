package pl.tomaszmalinowski.udemy.clasandobject;

public class Invoice {

    public static void main(String[] args) {


        calculateTax();
        getCustamerData();

    }

    private static void calculateTax() {
    }

    private static String getCustamerData() {

        Customer customer3 = new Customer("Adam", "Nowak","5832969085","test@test.pl","Kowalstwo");
        Address customer3Adress = new Address("Gdynia","81-546", "Zwycięstwa","245");


    }
}
