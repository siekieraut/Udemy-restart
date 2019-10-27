package pl.tomaszmalinowski.udemy.inheritance.zadanie;

public class FirstApp extends Activity {

    @Override
    public void onCreate() {
        System.out.println("FirstApp");
    }

    public void onPause() {
        super.onPause();
        System.out.println("true");
    }

    public void onStop() {
        super.onStop();
        System.out.println("false");
    }
}
