package ch.na50r;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
public class Main {
    static String[] output;
    public static void main(String[] args) throws IOException {
        FileToArray Cool = new FileToArray("data.txt");
        output = Cool.Extractor();
        System.out.println(Arrays.toString(output));

        Censor1 Uncool = new Censor1("O", "Q", output);
        String[] newOutput = Uncool.Filter();
        System.out.println(Arrays.toString(newOutput));

        FileToArray Data = new FileToArray("data2.txt");
        output = Data.Extractor();
        System.out.println(Arrays.toString(output));
        String[] bad = {"dick", "cunt", "kill", "pedophile", "asshole"};

        Censor3 FilteredData = new Censor3(bad, output);
        String[] newOut = FilteredData.Filter();
        System.out.println(Arrays.toString(newOut));

        ArrayToFile Out = new ArrayToFile("output_data.txt", newOut);
        Out.Inserter();





    }
}