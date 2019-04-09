package pl.tomaszmalinowski.udemy.clasandobject;

public class Customer {

    public final static String COMPANY_NAME = "LAS";

    private String firstaName;
    private String lastName;
    private Address address;
    private String taxNumber;
    private String eMail;
    private String companyName;



    public String getFirstaName() {
        return firstaName;
    }

    public void setFirstaName(String firstaName) {
        this.firstaName = firstaName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void introduceYorself () {
        System.out.println("Hello, I'm " + firstaName + " " + lastName + ".");
    }

    private String getFirstAndLastaName () {
        return firstaName + " " + lastName;
    }
}
