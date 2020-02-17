package pl.tomaszmalinowski.udemy.io;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Io2 {

    public static void main(String[] args) {
//        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
//            while (true) {
//                String line = bufferedReader.readLine();
//                if(line.equals("quit"))
//                    System.exit(0);
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();

//        }
        String separator = File.separator; //zmienia separatory w zaleznosci od systemu operacyjnego
        File file = new File("C:\\Users\\tomek\\IdeaProjects\\Udemy-restart\\src\\pl\\tomaszmalinowski\\udemy\\io\\abc.txt");
        System.out.println(file.exists());

        try {
            List<String> lines = Files.readAllLines (Paths.get("C:\\Users\\tomek\\IdeaProjects\\Udemy-restart\\src\\pl\\tomaszmalinowski\\udemy\\io\\abc.txt"));
            for (String str : lines) {
                System.out.println(str);

            }

        } catch (IOException e) {
            e.printStackTrace();

        }
        try {
            FileWriter writer = new FileWriter("C:\\Users\\tomek\\IdeaProjects\\Udemy-restart\\src\\pl\\tomaszmalinowski\\udemy\\io\\efg.txt", true);
            writer.write("Hello!");
            writer.write("\r\n");
            writer.write("How are you?");
            writer.close(); //zakańcza i tworzy plik

        } catch (IOException e2) {
            e2.printStackTrace();
        }


    }
}
