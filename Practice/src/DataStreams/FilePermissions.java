package DataStreams;

import java.io.File;

public class FilePermissions {
    public static void main(String[] args) {
        File file = new File("/Users/sreelekha/Study/Practice/src/DataStreams/input");
        try {
            if(file.exists()) {
                System.out.println("Executable: "+ file.canExecute());
                file.setWritable(false);
                System.out.println("Readable: "+ file.canRead());
                System.out.println("Writable: "+ file.canWrite());
                System.out.println("Name: "+ file.getName());

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
