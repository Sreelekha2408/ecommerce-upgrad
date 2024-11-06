public class BankAccount {
    double balance;
    double deposit(double amt) {
        return  this.balance + amt;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setBalance(25000.23);
        System.out.println(ba.deposit(2000));
    }
}
