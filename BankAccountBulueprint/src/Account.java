public class Account {
    private int accountNumber;
    private int  accountBalance;
    private String customerName;

    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositingFunds(int accountBalance) {
        this.accountBalance += accountBalance;
    }
    public void withdrawingFunds(int accountBalance) {
        int remain = this.accountBalance - accountBalance;
        if (remain < 0) System.out.println("Not be allowed!");
        else {
            this.accountBalance = remain;
        }
    }
}
