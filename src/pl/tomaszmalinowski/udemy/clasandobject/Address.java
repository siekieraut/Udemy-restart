package pl.tomaszmalinowski.udemy.clasandobject;

public class Address {
    private String postOffice;
    private String postCode;
    private String street;
    private String streetNumber;

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Address(String postOffice, String postCode, String street, String streetNumber) {
        this.postOffice = postOffice;
        this.postCode = postCode;
        this.street = street;
        this.streetNumber = streetNumber;
        System.out.println("create new address " + postOffice);
    }
}
