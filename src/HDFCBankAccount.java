import java.util.UUID;

public class HDFCBankAccount implements BankAccount {

    private String accountNo;

    private int balance;
    private int roi;

    public HDFCBankAccount(int balance) {
        this.balance = balance;
        this.accountNo= String.valueOf(UUID.randomUUID());// for random uid
        this.roi=5;

    }

    public HDFCBankAccount(int balance, int roi) {
        this.balance = balance;
        this.accountNo= String.valueOf(UUID.randomUUID());// for random uid
        this.roi = roi;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(this.balance>=money){
            this.balance=this.balance-money;
            System.out.println("Money is withdrawn");
                return true;
        }else{
            System.out.println("Money is not withdrawn");
            return false;
        }
    }

    @Override
    public int checkBankBalance(int money) {
        return balance;
    }

    @Override
    public boolean addMoney(int money) {
        this.balance+=money;
        return true;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int time) {
        return (amount*this.roi*time)/100;
    }
}

//home work for sbi
/*
1-min balance =500;
2-roi should be dependent on age  directly propostional to age

 */