package pl.tomaszmalinowski.udemy.interfaces.zadanie;

public interface Phone {

    boolean sendSms (String text, Integer number);

    boolean sendMms (byte[] picture, Integer number);

    void call (Integer number);
}
