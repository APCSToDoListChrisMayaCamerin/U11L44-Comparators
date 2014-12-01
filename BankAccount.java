
/**
 * A bank account class that tracks the account name and the balance
 * 
 * @author Mr. Jaffe
 * @version 2014-11-23
 */
public class BankAccount
{
    /**
     * Instance variables
     * name Account name
     * balance Current account balance
     */
    private String name; 
    private double balance;

    /**
     * Constructor for the class
     * @param nm Account name
     * @param amt Beginning balance
     */
    public BankAccount(String nm, double amt) {
        name = nm;
        balance = amt; 
    }
    
    /**
     * Deposit an amount
     * @param dp Deposit amount
     */
    public void deposit(double dp) {
        balance = balance + dp; 
    }

    /**
     * Withdraw an amount
     * @param wd Withdrawal amount
     */
    public void withdraw(double wd) {
        balance = balance - wd; 
    }
    
    /**
     * Get balance
     * @return Current balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Get account name
     * @return Account name
     */
    public String getName() {
        return name;
    }
}

