package pl.tomaszmalinowski.udemy.inheritance.zadanie;

public class SecendApp extends Activity {

    @Override
    public void onCreate() {
        System.out.println("SecendApp");
    }

    public void onPause() {
        super.onPause();
        System.out.println("false");
    }

    public void onStop() {
        super.onStop();
        System.out.println("true");
    }
}
