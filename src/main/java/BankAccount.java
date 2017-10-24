import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     *
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }
    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
/**
 *
 * @param name Owner name
 * @param accountCategory Category of the account
 */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public void SetAccountNum(final int num) {
        this.accountNumber = num;
    }
    public void SetAccountBal(final double num) {
        this.accountBalance = num;
    }
    public void SetOwnerName(final String name) {
        this.ownerName = name;
    }
    public SetAccountInt(final double num) {
        this.interestEarned = num;
    }
    public double GetBal() {
        return this.accountBalance;
    }
    public int GetNum() {
        return this.accountNumber;
    }
    public String GetOwnerName() {
        return this.ownerName;
    }
    public double GetInt() {
        return this.interestEarned;
    }
}