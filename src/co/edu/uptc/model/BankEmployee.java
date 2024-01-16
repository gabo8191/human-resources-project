package co.edu.uptc.model;

public class BankEmployee {
    private String bank;
    private String accountType;
    private long accountNumber;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankEmployee [bank=" + bank + ", accountType=" + accountType + ", accountNumber=" + accountNumber + "]";
    }

}
