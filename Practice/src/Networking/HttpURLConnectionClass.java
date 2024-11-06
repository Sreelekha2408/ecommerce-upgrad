package Networking;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionClass {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
        HttpURLConnection connection  = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        System.out.println(connection.getResponseCode());
        BufferedInputStream input = new BufferedInputStream(connection.getInputStream());
//        for (int i = input.read(); i != -1 ; i = input.read()) {
//            System.out.println(i);
//        }
//        connection.getResponseCode();
//        connection.getResponseMessage();
//        connection.getInputStream();
        connection.disconnect();
    }
}
