package pl.tomaszmalinowski.udemy.interfaces.zadanie;

public class Futurephone implements Phone {


    @Override
    public boolean sendSms(String text, Integer number) {
        System.out.println("Write: " + text + "Send to: " + number);
        return false;
    }

    @Override
    public boolean sendMms(byte[] picture, Integer number) {
        System.out.println("Send: " + picture + " to: " + number);
        return false;
    }

    @Override
    public void call(Integer number) {
        System.out.println("Call to: " + number);

    }
}
