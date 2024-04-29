package StringFunctions;

import java.util.Arrays;

public class StringBuilderManipulator {
    public static String concatenateStrings(String[] strings) {
        StringBuilder str = new StringBuilder();
        for (String s : strings) {
            str.append(s);
        }
        return str.toString();
    }

    public static String insertSubstring(String original, String substring, int position) {
        StringBuilder str = new StringBuilder(original);
        str.insert(position, substring);
        return str.toString();
    }
    public static void main(String[] args) {
        String[] str = {"Hello", ", ", "world", "!"};
        String added = concatenateStrings(str);
        System.out.println("Concatenated: "+ added);
        String subString = "beautiful ";
        String originalString = "The sun shines bright";
        String result = insertSubstring(originalString, subString, 10);
        System.out.println("Inserted: " +result);
    }
}
