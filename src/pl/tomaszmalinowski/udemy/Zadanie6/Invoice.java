package pl.tomaszmalinowski.udemy.Zadanie6;

public class Invoice {

    public static void main(String[] args) {


        calculateTax();
        setCustamerData();




    }

    public static double calculateTax(double p) {
        double VAT = 0.23;
        return VAT * p;
    }

    private static void setCustamerData() {

        Customer customer4 = new Customer("Jan", "Nowak", "5832969085", "test@test.pl", "ZFRT");
        Address customer4Address = new Address("Gdynia", "81-456", "Zwycięstwa", "245");

        System.out.println("---------Nabywca---------");
        System.out.println("NIP: " + customer4.getTaxNumber());
        System.out.println(customer4.getCompanyName());
        System.out.println(customer4.getFirstaName() + " " + customer4.getLastName());
        System.out.println(customer4Address.getStreet() + " " + customer4Address.getStreetNumber());
        System.out.println(customer4Address.getPostCode() + " " + customer4Address.getPostOffice());
        
    }




}
