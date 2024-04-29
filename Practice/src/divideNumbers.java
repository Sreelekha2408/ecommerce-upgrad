public class divideNumbers {
    int dividend;
    int divisor;

    public divideNumbers(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    void calculateDivison() {
        try {
            if(divisor == 0) {
                throw new ArithmeticException("Error: Cannot divide by zero.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        divideNumbers divide = new divideNumbers(2, 0);
        divide.calculateDivison();
    }
}
