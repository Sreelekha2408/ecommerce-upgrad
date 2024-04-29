package DataStreams;

import java.io.*;

public class FileReaderAndWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sreelekha/Study/Practice/src/DataStreams/input");
        File file1 = new File("/Users/sreelekha/Study/Practice/src/DataStreams/output3.txt");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file1);
        try {
            for (int i = fileReader.read(); i != -1 ; i = fileReader.read()) {
                fileWriter.write(i);
            }
            fileWriter.flush();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fileReader.close();
            fileWriter.close();
        }
    }
}
