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

        Customer customer1 = new Customer();

        customer1.setFirstaName("Tomasz");
        customer1.setLastName("Tomasz");

        Address customer1Address = new Address();
        customer1Address.setPostOffice("Gdynia");
        customer1Address.setPostCode("81-560");
        customer1Address.setStreet("Szturmnaów");
        customer1Address.setStreetNumber("33");

        customer1.setAddress(customer1Address);


        System.out.println(customer1.getFirstaName());
        System.out.println(customer1.getAddress());


    }
}
