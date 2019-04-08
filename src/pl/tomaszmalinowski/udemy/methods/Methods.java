package pl.tomaszmalinowski.udemy.methods;

public class Methods {

    public static void main(String[] args) {
        sayHi();
        sayHi();
        hi("Remek");
        hi("Krzychu");

    }

    private static void sayHi() {
        System.out.println("Hi Tomek");
    }

    private static void hi (String name) {
        System.out.println("Hi " + name);
    }
}
