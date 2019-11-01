package pl.tomaszmalinowski.udemy.encapsulation;

public interface EncI {
    void hi();

    EncI encI = new EncI() {
        @Override
        public void hi() {

        }
    };
}
