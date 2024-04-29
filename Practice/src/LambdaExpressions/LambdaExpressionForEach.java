package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExpressionForEach {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
    students.forEach((String student) -> System.out.println("Student.. " + student));
    }
}
