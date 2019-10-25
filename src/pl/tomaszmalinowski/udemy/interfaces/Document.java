package pl.tomaszmalinowski.udemy.interfaces;

public interface Document {

    public String d = "d";

    public boolean save ();

    public String open (String path);

    public default void introduceYorself () {
        System.out.println("interface Document");

    }
    //interface nie mze importować innych interfaceów ale moze rozszezac o inne interface

}
