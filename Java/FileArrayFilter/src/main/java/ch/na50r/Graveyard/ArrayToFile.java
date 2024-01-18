package ch.na50r.Graveyard;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ArrayToFile {
    String file;
    String[] input;

    public ArrayToFile(String filename, String[] input) {
        this.file = filename;
        this.input = input;
    }

    public void Inserter() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.file));
        for (String word : input){
            writer.write(word + "\n");
        }
        writer.close();
    }
}
