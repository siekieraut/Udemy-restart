package pl.tomaszmalinowski.udemy.polymorphism;

public class Box<T> {
    //klasa generyczna

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
