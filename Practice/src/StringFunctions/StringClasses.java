package StringFunctions;

public class StringClasses {
    public static void main(String[] args) {
        String name = "Sreelekha";
        //subString method
        System.out.println(name.substring(0,4));
        System.out.println(name.substring(4));

        //StringBuilder
        StringBuilder str =  new StringBuilder("Lexi");
        str.append(" Stefan");
        System.out.println(str);
        System.out.println(str.delete(0,5));

        //StringBuffer
        StringBuffer str1 = new StringBuffer("Damon");
        str1.append(" Elena");
        System.out.println(str1);
        System.out.println("deleting.. " + str1.delete(5,11));
    }
}
