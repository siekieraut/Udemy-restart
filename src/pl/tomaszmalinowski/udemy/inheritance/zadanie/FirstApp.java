package pl.tomaszmalinowski.udemy.inheritance.zadanie;

public class FirstApp extends Activity {

    @Override
    public void onCreate() {

    }

    public void onPause() {
        System.out.println("true");
    }

    public void onStop() {
        System.out.println("false");
    }
}
