package pl.tomaszmalinowski.udemy.inheritance;

public class CarFactory extends Factory {

    private String name;

    @Override
    public void checkState() {
        //super.checkState(); - odnosisie do metody wyzej w hierrhi dziedziczenia
        super.checkState();
        System.out.println("checkStateInCarFactory");
    }

    public void testDrive() {
        System.out.println("testDrive");
    }

    @Override
    public void destroy() {
        System.out.println("carDestroy");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
