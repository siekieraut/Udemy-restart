package pl.tomaszmalinowski.udemy.inheritance.zadanie;

public abstract class Activity {

    public abstract void onCreate();

    public void onPause() {
        System.out.println("onPause");
    }

    public void onStop() {
        System.out.println("onStop");
    }



}
