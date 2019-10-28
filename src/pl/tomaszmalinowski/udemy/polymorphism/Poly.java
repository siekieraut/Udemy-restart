package pl.tomaszmalinowski.udemy.polymorphism;

import pl.tomaszmalinowski.udemy.interfaces.Document;
import pl.tomaszmalinowski.udemy.interfaces.DrawDokument;
import pl.tomaszmalinowski.udemy.interfaces.TxtDocument;

public class Poly {

    public static void main(String[] args) {
        Document draw = new DrawDokument();

        if (draw instanceof DrawDokument) {
            System.out.println(true);
        }
        if (draw instanceof TxtDocument) {
            System.out.println(true);
        }

        Box<Document> box = new Box<>();
        box.setT(new TxtDocument());
        box.setT(new DrawDokument());

        Box<String> box2 = new Box<>();
        
    }
}
