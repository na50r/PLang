package ch.na50r;
import javax.management.relation.RelationNotFoundException;
import java.io.IOException;
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        //OOP Approach
//        String[] output = FileArray.Extractor("data.txt");
//        System.out.println(Arrays.toString(output));
//        String[] bad = {"dick", "cunt", "kill", "pedophile", "asshole", "ass", "fuck", "shit"};
//        Censor3 FilteredData = new Censor3(bad, output);
//        String[] newOut = FilteredData.Filter();
//        System.out.println(Arrays.toString(newOut));
////        FileArray.Inserter("filtered_data.txt", newOut);

        String[] RandomInput = {"Apple", "Banana", "Pineapple", "Cuck"};
        String[] Bad = {"Cuck"};
        String[] FilteredInput = Filter(Bad, RandomInput);
        Inserter(FilteredInput);
        String[] RadnomOutput = Extractor("output1.txt");
        System.out.println(Arrays.toString(RadnomOutput));


    }

        //Procedural Approach
        public static String[] Extractor(String FileName) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(FileName));
            String Output;
            int lines = 0;
            while(reader.readLine() != null){
                lines++;
        }
            reader.close();
            reader = new BufferedReader(new FileReader(FileName));
            String[] data = new String[lines];
            int idx = 0;
            while((Output = reader.readLine())!=null){
                data[idx] = Output;
                idx++;
            }
            reader.close();
            return data;
    }
        public static void Inserter(String[] InputArray) throws IOException{
            int idx = 0;
            String baseFileName = "output";
            String fileExtension = ".txt";
            String fileName = baseFileName + idx + fileExtension;
            while(new File(fileName).exists()){
                //If it exists
                idx++;
                fileName = baseFileName + idx + fileExtension;
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String word: InputArray){
                writer.write(word + "\n");
            }
            writer.close();
        }

        public static String[] Filter(String[] curseWords, String[] content){
        int n = content.length;
        for(int i = 0; i<n; i++){
            for(String curse: curseWords){
                content[i] = content[i].replace(curse, bleepGenerator(curse.length()));
            }
        }
        return content;
        }

        public static String bleepGenerator(int length){
            String[] base = {"$", "#", "!", "%"};
            String[] out = new String[length];
            for(int i = 0; i<length; i++){
                out[i] = base[i%base.length];
            }
            return String.join("", out);

        }

}

