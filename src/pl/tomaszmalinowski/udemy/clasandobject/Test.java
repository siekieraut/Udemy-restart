package pl.tomaszmalinowski.udemy.clasandobject;

public class Test {
    public static void main(String[] args) {
//        int x = 1;
//        String s = " ";
//
//        Customer customer1 = new Customer();
//        customer1.name = "Tomek";
//        s = Customer.COMPANY_NAME;
//
//        System.out.println(customer1.name);
//
//        Customer customer2 = null;
//
//        System.out.println(customer1);
//        System.out.println(customer2);
//
//        if (customer2!= null) {
//            System.out.println(customer2.name);
//        }

        Customer customer1 = new Customer("Tomek","Malinowski", "5832969085", "test2test.pl", "FREQAS");

        customer1.setFirstaName("Tomasz");
        customer1.setLastName("Tomasz");

        Address customer1Address = new Address("Gdynia", "81-560", "Szturmanów", "33");
//        customer1Address.setPostOffice("Gdynia");
//        customer1Address.setPostCode("81-560");
//        customer1Address.setStreet("Szturmnaów");
//        customer1Address.setStreetNumber("33");


        System.out.println(customer1.getFirstaName());




    }
}
