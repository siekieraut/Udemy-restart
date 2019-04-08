package pl.tomaszmalinowski.udemy.clasandobject;

public class Customer {

    public final static String COMPANY_NAME = "LAS";

    private String firstaName;
    private String lastName;
    private Address address;

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
}
