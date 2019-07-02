package pl.tomaszmalinowski.udemy.interfaces;

import java.io.Serializable;

public class TxtDocument implements Document, Serializable  {
    @Override
    public boolean save() {
        //dodatkowe operacje
        System.out.println("Save Txt Doc.");
        return true;
    }

    @Override
    public String open(String path) {
        // dodatkowe operacje
        return "Txt file:" + path;
    }
}
