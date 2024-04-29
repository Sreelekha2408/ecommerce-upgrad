public class Bank {
    private long accountNumber;
    private String accountHolderName;
    private double balance;
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    void deposit(double amt) {
        setBalance(getBalance() + amt);
    }

    void withdraw(double amt) {
          setBalance(getBalance() - amt);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBalance(800.0);
        bank.setAccountNumber(12345);
        bank.setAccountHolderName("John Doe");
        bank.deposit(200.0);
        bank.withdraw(300.0);
        System.out.println("Account Holder: " + bank.getAccountHolderName());
        System.out.println("Account Number: " + bank.getAccountNumber());
        System.out.println("Balance: $" + bank.getBalance());
    }
}
