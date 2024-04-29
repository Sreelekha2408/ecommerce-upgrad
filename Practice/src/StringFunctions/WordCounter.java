package StringFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordCounter {
    public static int countWordOccurrences(String text, String word) {
        String[] a = text.split(" ");
        List<String> filteredList = Arrays.stream(a)
                .filter(b -> b.equals(word))
                .collect(Collectors.toList());
        return filteredList.size();
    }
    public static String findLongestWord(String text) {
        String[] a = text.split(" ");
        String longest = a[0];
        for(String i: a) {
            if(i.replace(".", "").length() > longest.length()) {
                longest = i;
            }
        }
        return longest;
    }

    public static String removeVowels(String text) {
        return text.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        String text = "Java programming is fun and challenging.";
        String word = "Java";
        int count = countWordOccurrences(text, word);
        System.out.println("Occurrences of \"" + word + "\": " + count);
        String longest = findLongestWord(text);
        System.out.println("Longest word: "+longest);
        String withoutVowels = removeVowels(text);
        System.out.println("Text without vowels: " + withoutVowels);
    }
}
