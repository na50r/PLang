package ch.na50r;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Handler {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Jackson, it's me");
        writer.write("\nOMG!");
        writer.write("\nI know right? Crazy.");
        String[] names = {"Kekw", "OwO", "UwU", "OmO"};

        for (String name:names){
            writer.write("\n" + name);
        }
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String output = reader.readLine();
        System.out.println(output);
    }


}
