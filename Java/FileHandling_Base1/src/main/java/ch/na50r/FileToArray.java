package ch.na50r;
import java.io.*;


public class FileToArray {
    String file;
    public FileToArray(String fileName){
        this.file = fileName;
    }

    public String[] Extractor() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(this.file));
        String output;
        int lines = 0;
        while(reader.readLine() != null){
            lines++;
        }
        reader.close();
        reader = new BufferedReader(new FileReader(this.file));
        String[] data = new String[lines];
        int idx = 0;
        while((output= reader.readLine())!=null){
            data[idx] = output;
            idx++;
        }
        reader.close();
        return data;
    }
}
