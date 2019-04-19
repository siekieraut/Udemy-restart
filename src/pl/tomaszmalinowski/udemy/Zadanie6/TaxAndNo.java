package pl.tomaszmalinowski.udemy.Zadanie6;

public class TaxAndNo {

    public final static double tax = 0.23;

    private int id;
    private int mountch;
    private int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMountch() {
        return mountch;
    }

    public void setMountch(int mountch) {
        this.mountch = mountch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TaxAndNo(int id, int mountch, int year) {
        this.id = id;
        this.mountch = mountch;
        this.year = year;
    }
}
