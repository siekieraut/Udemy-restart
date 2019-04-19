package pl.tomaszmalinowski.udemy.Zadanie6;

public class Invoice {

    public static void main(String[] args) {


        calculateTax(23.5);
        setCustamerData();
        price(56.6);




    }



    public static double calculateTax(double p) {
        double tax = 0;
        double vat = 0.23;
        return tax = vat * p;
    }

    private static void setCustamerData() {

        TaxAndNo TaxAndNo1 = new TaxAndNo(21, 03,2019);
        System.out.println("FAKTURA " + TaxAndNo1.getId() + "/" + TaxAndNo1.getMountch() + "/" + TaxAndNo1.getYear());

        Customer customer4 = new Customer("Jan", "Nowak", "5832969085", "test@test.pl", "ZFRT");
        Address customer4Address = new Address("Gdynia", "81-456", "Zwycięstwa", "245");

        System.out.println("---------Nabywca---------");
        System.out.println("NIP: " + customer4.getTaxNumber());
        System.out.println(customer4.getCompanyName());
        System.out.println(customer4.getFirstaName() + " " + customer4.getLastName());
        System.out.println(customer4Address.getStreet() + " " + customer4Address.getStreetNumber());
        System.out.println(customer4Address.getPostCode() + " " + customer4Address.getPostOffice());

        System.out.println("---------Sprzedający---------");
        System.out.println("NIP: " + OurCompanyData.COMPANY_NIP);
        System.out.println(OurCompanyData.COMPANY_NAME);
        System.out.println("ul. " + OurCompanyData.COMPANY_STREET + " " + OurCompanyData.COMPANY_STREET_NO);
        System.out.println(OurCompanyData.COMPANY_POST + " " + OurCompanyData.COMPANY_POST_CODE);


        
    }

    private static void price(double m) {
        System.out.println("---------Cena---------");
        System.out.println("Netto " + m + " zł");
        System.out.println("VAT " + calculateTax(m) + " zł" );
        System.out.println("Brutto " + (calculateTax(m) + m) + " zł");


    }




}
