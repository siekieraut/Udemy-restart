package pl.tomaszmalinowski.udemy.Zadanie6;

public class Customer {


    private String firstaName;
    private String lastName;
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

    public Customer(String firstaName, String lastName, String taxNumber, String eMail, String companyName) {
        this.firstaName = firstaName;
        this.lastName = lastName;
        this.taxNumber = taxNumber;
        this.eMail = eMail;
        this.companyName = companyName;
    }



    /*
    public void introduceYorself () {
        System.out.println("Hello, I'm " + firstaName + " " + lastName + ".");
    }

    private String getFirstAndLastaName () {
        return firstaName + " " + lastName;
    }
*/
}
