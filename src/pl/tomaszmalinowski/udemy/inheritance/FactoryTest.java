package pl.tomaszmalinowski.udemy.inheritance;

public class FactoryTest {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        PhoneFactory phoneFactory = new PhoneFactory();

        carFactory.produce();
        phoneFactory.produce();
        carFactory.testDrive();
        phoneFactory.testCall();
        carFactory.checkState();
        phoneFactory.checkState();

/*
        Factory factory = new Factory() {
            @Override
            public void produce() {
                super.produce();
            }

            @Override
            public void checkState() {
                super.checkState();
            }
*/
        System.out.println(phoneFactory.introduceYorself());

        CarFactory car1 = new CarFactory();
        CarFactory car2 = new CarFactory();
        car1.setName("Alfa");
        car2.setName("Fiat");
        System.out.println(car1.equals(car2));


    }

}
