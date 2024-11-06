package DataStreams;

import java.io.*;

public class BufferInputStreamClass {
    public static void main(String[] args) throws IOException {
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        try {
            input = new BufferedInputStream(new FileInputStream("/Users/sreelekha/Study/Practice/src/DataStreams/input"));
            output = new BufferedOutputStream(new FileOutputStream("/Users/sreelekha/Study/Practice/src/DataStreams/output2.txt"));
            for (int i = input.read(); i != -1; i = input.read()) {
                output.write(i);
            }
            output.flush();
        }catch (Exception e) {
            System.out.println(e);
        } finally {
            if(input!= null ){
                input.close();
            }
            if(output!= null ){
                output.close();
            }
        }
    }
}
