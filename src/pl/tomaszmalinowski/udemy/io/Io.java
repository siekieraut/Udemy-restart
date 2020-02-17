package pl.tomaszmalinowski.udemy.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Io {

    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (Exception e) {

        }
    }
}
