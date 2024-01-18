package ch.na50r;
import java.io.IOException;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        String[] output = FileArray.Extractor("data.txt");
        System.out.println(Arrays.toString(output));

        String[] bad = {"dick", "cunt", "kill", "pedophile", "asshole", "ass", "fuck", "shit"};
//
        Censor3 FilteredData = new Censor3(bad, output);
        String[] newOut = FilteredData.Filter();
        System.out.println(Arrays.toString(newOut));

        FileArray.Inserter("filtered_data.txt", newOut);






    }
}