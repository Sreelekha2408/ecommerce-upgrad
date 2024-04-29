package StringFunctions;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TextValidator {
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
    public static String removeDuplicateCharacters(String text) {
        String[] r = text.split("");
        return Arrays.stream(r).distinct().collect(Collectors.joining());
    }
    public static String replaceWords(String text, Map<String, String> wordMap) {
        String[] keys = wordMap.keySet().toArray(new String[0]);
        String b = null;
        for (String key : keys) {
            if(text.contains(key)) {
                b = text.replace(key, wordMap.get(key));
            }
        }
        return b;
    }

    public static void main(String[] args) {
        String str = "programming";
        String email = "invalid.email";
        boolean isValidEmail = isValidEmail(email);
        String s = removeDuplicateCharacters(str);
        System.out.println("Is valid email? "+ isValidEmail);
        System.out.println("After removing duplicates: "+ s);
        String r = "Java is a popular coding language.";
        Map<String, String> m = new HashMap<>();
        m.put("Java","Python");
        String result = replaceWords(r,m);
        System.out.println("Replaced text: "+ result);
    }
}
