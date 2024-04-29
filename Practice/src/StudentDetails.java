public class StudentDetails {
    String name;
    int age;
    char grade;

    public StudentDetails(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayDetails(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.age);
        System.out.println("Grade: "+ this.grade);
    }

    public static void main(String[] args) {
        StudentDetails student = new StudentDetails("John Doe", 17, 'A');
        student.displayDetails();
    }
}
