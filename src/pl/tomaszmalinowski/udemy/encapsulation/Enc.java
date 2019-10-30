package pl.tomaszmalinowski.udemy.encapsulation;

public class Enc {

    private static int x; // widoczny w obrę bie danej klasy
    protected int y; // dostepny w klasie pakiecie i podklasie

    int z; //modyfikator domyślny - dostep dla klasy i pakietu

    public static void main(String[] args) { //publiczne dla wszystkich

    }

    private int getInside() {
        InsideEnc insideEnc = new InsideEnc();
        return insideEnc.insideZ;
    }

    class InsideEnc{
        private int insideZ = 0;
    }
}
