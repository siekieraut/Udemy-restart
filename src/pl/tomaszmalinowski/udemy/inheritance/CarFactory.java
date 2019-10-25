package pl.tomaszmalinowski.udemy.inheritance;

public class CarFactory extends Factory {

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
}
