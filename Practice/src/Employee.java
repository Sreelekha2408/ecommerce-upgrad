public class Employee {
    private double salary;
    private double bonusPercentage;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    double calculateBonus() {
        return salary + salary * (bonusPercentage/100);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(2500);
        emp.setBonusPercentage(100);
        double bonusAmount = emp.calculateBonus();
        System.out.println("Bonus Amount: "+ bonusAmount);
    }
}
