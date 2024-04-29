public class BankAccount2 {
    int accountNumber;
    String accountHolderName;
    double balance;
    public BankAccount2(String accountHolderName, int accountNumber,  double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    void deposit(double amt) {
        setBalance(balance + amt);
    }
    void  withdraw(double amt){
        if(balance < amt) {
            System.out.println("The balance is insufficient");
        } else {
            setBalance(balance - amt);
        }
    }

    void transfer(BankAccount2 toAccount, double amt) {
        if(amt < balance) {
            System.out.println("Transfer successful.");
            toAccount.setBalance(toAccount.getBalance() + amt);
            setBalance(balance - amt);
        } else {
            System.out.println("Transfer amount exceeds the current account balance.");
        }
    }
    public static void main(String[] args) {
        BankAccount2 bank1 = new BankAccount2("John Doe", 12345, 600);
        BankAccount2 bank2 = new BankAccount2("Alice Smith", 67890, 1700);
        bank1.deposit(600);
        bank1.withdraw(500);
        bank2.deposit(300);
        bank2.withdraw(400);
        bank1.transfer(bank2, 400);
        System.out.println("Account Holder: " + bank1.getAccountHolderName());
        System.out.println("Account Number: " + bank1.getAccountNumber());
        System.out.println("Balance: $" +bank1.getBalance() + "\n");
        System.out.println("Account Holder: " + bank2.getAccountHolderName());
        System.out.println("Account Number: " + bank2.getAccountNumber());
        System.out.println("Balance: $" +bank2.getBalance());
    }
}
