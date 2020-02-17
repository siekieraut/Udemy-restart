package pl.tomaszmalinowski.udemy.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Io3 {

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String line = bufferedReader.readLine();
                if(line.equals("quit"))
                    System.exit(0);
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
