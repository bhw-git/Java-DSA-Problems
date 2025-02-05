package FileReadAndWrite;

import java.io.*;

public class ReadandWriteFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(".\\src\\FileReadAndWrite\\outputFile.txt"));
        writer.write("Hello\n");
        writer.write("This is the second line of string\n");
        writer.write("This is the third line of string");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(".\\src\\FileReadAndWrite\\outputFile.txt"));
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}
