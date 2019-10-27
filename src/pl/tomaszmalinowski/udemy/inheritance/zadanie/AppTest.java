package pl.tomaszmalinowski.udemy.inheritance.zadanie;

public class AppTest {

    public static void main(String[] args) {

        FirstApp firstApp = new FirstApp();
        SecendApp secendApp = new SecendApp();


        firstApp.onCreate();
        firstApp.onPause();
        secendApp.onCreate();
        secendApp.onPause();


    }
}
