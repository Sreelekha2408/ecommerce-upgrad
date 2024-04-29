package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWordDefinition(String word, String definition) {
        dictionary.put(word, definition);
    }
    public String getWordDefinition(String word) {
        return dictionary.get(word);
    }
    public boolean hasWord(String word) {
       return dictionary.containsKey(word);
    }

    public static void main(String[] args) {
        Dictionary dic = new Dictionary();
        dic.addWordDefinition("Java", "A high-level programming language.");
        dic.addWordDefinition("OOP", "Object oriented programming.");
        dic.addWordDefinition("Algorithm", "A Set of Instructions.");
        String definition = dic.getWordDefinition("Java");
        System.out.println("Definition of \"Java\": " + definition);
        boolean isDefinitionExists = dic.hasWord("Algorithm");
        System.out.println("Has \"Algorithm\"? "+ isDefinitionExists);
    }
}
