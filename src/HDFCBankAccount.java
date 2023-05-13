public class HDFCBankAccount implements BankAccount {

    private int balance;

    public HDFCBankAccount(int balance) {
        this.balance = balance;
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
}
