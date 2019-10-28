package pl.tomaszmalinowski.udemy.encapsulation.inside;

import pl.tomaszmalinowski.udemy.encapsulation.Enc;

public class Enc2 extends Enc{

    void test() {
        Enc enc = new Enc();
        // enc.z;  - nie mamy dostepu
        //enc.y; -  nie mamy dostępu
        this.y = 12;

    }
}
