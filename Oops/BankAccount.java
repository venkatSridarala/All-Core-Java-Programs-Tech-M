package Oops;
import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    String accountHoldersName;
    static double balance;

    public BankAccount(int accountNumber, String accountHoldersName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    
    class SavingsAccount extends BankAccount {
        double interestRate;

        public SavingsAccount(int accountNumber, String accountHoldersName, double balance, double interestRate) {
            super(accountNumber, accountHoldersName, balance);
            this.interestRate = interestRate;
        }

        void applyinterest() {
            balance += balance * (interestRate / 100);4
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        BankAccount bankAccount = new BankAccount(36720490, "Ram", 1000.0);
        BankAccount.SavingsAccount sa = bankAccount.new SavingsAccount(36720490, "Ram", 1000.0, 8.0);
    
        int d = 1;
        do {
            System.out.println("\nBank Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4.Check balance after interest");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Deposit
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    sa.deposit(depositAmount);
                    break;

                case 2:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    sa.withdraw(withdrawAmount);
                    break;

                case 3:
                    // Check balance
                    sa.checkBalance();
                    break;
                case 4:
                	//check interest
                	sa.applyinterest();
                	 System.out.println("After interest:"+balance);

                case 5:
                    // Exit
                    System.out.println("Exiting... Thank you for using our banking system!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println("Enter 1 to continue 0 to exit.");
            d = scanner.nextInt();
        } while (d == 1);

        scanner.close();
    }
}