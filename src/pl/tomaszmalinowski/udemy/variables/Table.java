package pl.tomaszmalinowski.udemy.variables;

public class Table {

    public static void main(String[] args) {
    int[] ints;
    ints = new int [3];

    ints[0] = 6; //1 element
    ints[1] = 3; //2 element
    ints[2] = 765;

    System.out.println(ints[1]);
    // System.out.println(ints[4]);

    String strings [] = {"el1", "el2", "el3"};
    System.out.println(strings[1]);



    //-------------- multidimensional arry
    String[] [] strings2 = {{"q","w","e"},{"a"},{"el1", "el2", "el3","el1", "el2", "el3","el1", "el2", "el3"}};
    System.out.println(strings2[0][2]);

    int[][][] ints3 = new int[2][3][4];
    ints3 = new int[][][]{{{1,2},{3,4},{5,6},{7,8}}};
    System.out.println(ints3);



    }
}
