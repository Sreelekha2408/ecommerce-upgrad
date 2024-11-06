package DataStreams;

import java.io.*;

public class InputAndOutputStream {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream = System.in;
//        int data = inputStream.read();
//        System.out.println("You entered: " + (char) data);
//        inputStream.close();

        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream("/Users/sreelekha/Study/Practice/src/DataStreams/input");
            output = new FileOutputStream("/Users/sreelekha/Study/Practice/src/DataStreams/output.txt");
            for (int i = input.read(); i != -1 ; i = input.read()) {
                output.write(i);
            }
            output.flush();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if(input!=null) {
                input.close();
            }
            if(output!=null) {
                output.close();
            }
        }


    }
}
