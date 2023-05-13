public class SBIBankAccount implements BankAccount{

    @Override
    public boolean withdrawMoney(int money) {
        return false;
    }

    @Override
    public int checkBankBalance(int money) {
        return 0;
    }

    @Override
    public boolean addMoney(int money) {
        return false;
    }

    @Override
    public int getROI() {
        return 0;
    }

    @Override
    public int getTotalInterest(int amount, int time) {
        return 0;
    }
}
