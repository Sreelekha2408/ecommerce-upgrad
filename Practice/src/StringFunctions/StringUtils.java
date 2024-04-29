package StringFunctions;

import java.util.Scanner;

public class StringUtils {
    public static int countWords(String text) {
        String[]  a =  text.split(" ");
        return  a.length;
    }
    public static String reverseString(String text) {
        StringBuffer s = new StringBuffer(text);
        return s.reverse().toString();
    }
    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        // Remove spaces and convert to lowercase for comparison
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        // Check if the clean text is equal to its reverse
        return cleanText.equals(reverseString(cleanText));

    }
    public static String capitalizeWords(String text) {
        String[]  a =  text.split(" ");
        String[] b = new String[a.length];
        for(int i=0; i<a.length; i++) {
            String a1 = a[i].substring(0,1).toUpperCase();
            String b1 = a1 + a[i].substring(1);
            b[i] = b1;
        }
        return String.join(" ", b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        a = in.nextLine();
        int count = countWords(a);
        String reverse =  reverseString(a);
        boolean isPalindrome = isPalindrome(a);
        String upper = capitalizeWords(a);
        System.out.println("Word count: "+ count);
        System.out.println("Reversed string: "+ reverse);
        System.out.println("Is palindrome: "+ isPalindrome);
        System.out.println("Capitalized words: "+ upper);
    }
}
