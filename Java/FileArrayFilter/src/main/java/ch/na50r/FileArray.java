package ch.na50r;
import java.io.*;

public class FileArray {
    public static String[] Extractor(String FileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FileName));
        String output;
        int lines = 0;
        while(reader.readLine() != null){
            lines++;
        }
        reader.close();
        reader = new BufferedReader(new FileReader(FileName));
        String[] data = new String[lines];
        int idx = 0;
        while((output= reader.readLine())!=null){
            data[idx] = output;
            idx++;
        }
        reader.close();
        return data;
    }

    public static void Inserter(String FileName, String[] InputArray) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(FileName));
        for (String word : InputArray){
            writer.write(word + "\n");
        }
        writer.close();
    }
}





