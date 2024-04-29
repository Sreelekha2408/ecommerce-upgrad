package StringFunctions;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "Sreelekha";
        String lastName = " Nossam";
        String fullName = "Sreelekha" + " Nossam";
        System.out.println("Using + sign: "+fullName);
        String usingMethod = firstName.concat(lastName);
        System.out.println("Using .concat method: " +  usingMethod);
        String concatenation = firstName.concat(" ").concat("MS");
        System.out.println("Double concatenation: "+concatenation);
    }
}
