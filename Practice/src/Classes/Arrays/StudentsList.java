package Classes.Arrays;

public class StudentsList {
    public static void printStudentsList() {
        String[] students = {"Sreelekha", "Sudha", "Manu"};
        for(String student: students) {
            System.out.println(student);
        }
    }
    public static void printNumbers() {
        int[] students = {2, 4, 5, 10, 42, 76};
        for(int num: students) {
            System.out.print(num +" ");
        }
    }
    public static void main(String[] args) {
        printStudentsList();
        printNumbers();
    }
}
