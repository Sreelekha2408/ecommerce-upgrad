package StringFunctions;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Sree";
        String s2 = "Sree";
        String s3 = new String("Sree");
        //Equals method
        System.out.println("Equals To method ");
        System.out.println(s1.equals(s2));
        System.out.println( s1.equals(s3));
        String s4 = "Sreelekha";
        System.out.println(s1.equals(s4));

        //CompareTo method
        System.out.println("Compare To method ");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

        //Immutable check
        System.out.println("String Immutable check ");
        String originalString = "Hello";
        originalString.concat(", World!");
        System.out.println(originalString); // Output: "Hello" (original string is not changed)
        // we need to create a new string to store the concatenated string


        String str1 = "Hello";
        String str2 = "World";
        str1 = str1.concat(str2);
        System.out.println(str1);

    }
}
