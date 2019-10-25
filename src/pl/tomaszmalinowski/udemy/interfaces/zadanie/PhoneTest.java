package pl.tomaszmalinowski.udemy.interfaces.zadanie;

public class PhoneTest {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Futurephone futurephone = new Futurephone();
        smartphone.sendMms(null, 123456789);
        futurephone.sendSms("Hi, How are you? ", 123456789);
        smartphone.call(123456789);
    }
}
