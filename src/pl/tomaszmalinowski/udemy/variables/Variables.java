package pl.tomaszmalinowski.udemy.variables;

public class Variables {

    public static void main(String[] args) {
        byte b = 127;
        byte b1 = 1;
        //min -128 max 127
        short s = Short.MAX_VALUE;
        short s1 = Short.MIN_VALUE;
        int i = Integer.MAX_VALUE;
        int i1 = Integer.MIN_VALUE;
        long l = Long.MAX_VALUE;
        long l1 = Long.MIN_VALUE;
        Long l2 = 23L;


        float f = 1.1f;
        float f1 = Float.MAX_VALUE;
        double d = Double.MAX_VALUE;
        double d1 = 2.2;

        char c = 'a';
        //pojedynczy cudzysłów
        String str = "Hello, how are you";

        boolean boo = true;
        boolean boo1 = false;


        System.out.println(s);
        System.out.println(s1);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f);
        System.out.println(f1);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(c);
        System.out.println(str);
        System.out.println(boo);
        System.out.println(boo1);

        //---------------------------------------

        System.out.println("Sum: " + (b + b1));
        System.out.println("Sum: " + b + b1);

        int x = 1 + 2;
        int x1 = x + b;
        System.out.println(x1);

        int y = b - b1;
        int xx = y * y;
        int yy = x1 / x;
        double dd = x1 / x;
        System.out.println(x1);
        System.out.println(yy); // 130/3 = 13 i 1/3
        System.out.println(dd); // 130/3 = 13 i 1/3 wyświetla zle bo zmienne wejscowe to int

        double dx = 3;
        double dy = 7;
        double dz = dx / dy;
        System.out.println(dz);
        int r = x1 % x;
        System.out.println(r);


        //-----------------------------------


        int t = 10;
        int t2 = 20;
        int t3 = 30;
        int t4 = 40;
        System.out.println("------------------------------");
        System.out.println(t++); //t = t+1
        System.out.println(t); //t = t+1
        System.out.println(++t2); //t = t+1
        System.out.println(t3--); //t = t+1
        System.out.println(t3); //t = t+1
        System.out.println(--t4); //t = t+1


        x += 5; //x= x + 5
        x -= 5; //x= x - 5
        x *= 5; //x= x * 5
        x /= 5; //x= x / 5
        x %= 5; //x= x % 5

        System.out.println(x);


        //---------------Constats--------------------------------


        final int Z_Z = 13;
        int z1;
        z1=8;
        System.out.println(Z_Z);


        // -----------------Var-------------------------------- java 10 ++

        var q = 7;
//        var e;
//        var w = null;
        var g = 1 ; // int > long
        var j = 1.1; // doble
        var u = "Napis"; // String
        var  n = "a"; // char






    }
}
