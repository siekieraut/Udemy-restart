package pl.tomaszmalinowski.udemy.inheritance.zadanie;

public class SecendApp extends Activity {

    @Override
    public void onCreate() {

    }

    public void onPause() {
        System.out.println("false");
    }

    public void onStop() {
        System.out.println("true");
    }
}
