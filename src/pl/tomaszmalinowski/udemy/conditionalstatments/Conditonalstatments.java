package pl.tomaszmalinowski.udemy.conditionalstatments;

public class Conditonalstatments {

    public static void main(String[] args) {

        int[] ints = {2, 3, 5, 1, 4};

        for (int i : ints) {
            if (i % 2 == 0) {
                System.out.println("%2 = " + i);
            } else if (i % 3 == 0) {
                System.out.println("%3 = " + i);
            }
//            if (i % 4 == 0) {
//                System.out.println("%4 = " + i);
//            }
            else {
                System.out.println("nothing");
            }

        }
        // ----------------I/ORAZ:

        for (int i : ints) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("a");
            }


        }

        //-----------------LUB

        for (int i : ints) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println("a");
            }


        }
        //----------------MIX

        for (int i : ints) {
            if ((i % 2 == 0 && i % 3 == 0) || i % 5 == 0) {
                System.out.println("a");
            }


        }

        for (int i : ints) {
            if (i < 3) {
                System.out.println("i<3 " + i);
            } else {
                System.out.println("i>3 " + i);
            }

        }

        //switch case //

        int menu = 5;
        switch (menu) {
            case 1:
                System.out.println("Mane Menu");
                break;
            case 2:
                System.out.println("Game Menu");
                break;
            case 3:
                System.out.println("End Menu");
                break;
            default:
                System.out.println("Invalid Parametr");
        }

    }
}
// w konstrukcji if i els if wykona sie pierwsza zgodna instrukcja puzniej if zostanie zakończony