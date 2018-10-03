import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    /**
     * Identification number of the account.
     */
    private int accountNumber;
    /**
     * Type of account.
     */
    private BankAccountType accountType;
    /**
     * How much money is stored in this account.
     */
    private double accountBalance;
    /**
     * The owner of this bank account.
     */
    private String ownerName;
    /**
     * The interest rate on this bank account.
     */
    private double interestRate;
    /**
     * The amount of interest amassed over time.
     */
    private double interestEarned;

    /**
     * Constructor to initialize each new BankAccount.
     * @param name the owner of the account.
     * @param accountCategory what type of account is being opened.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        accountType = accountCategory;
        Bank.setTotalAccounts(1);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }
}
