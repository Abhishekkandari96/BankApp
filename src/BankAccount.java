public interface BankAccount {

    //withdraw money feature
    boolean withdrawMoney(int money);
    //check bank balance
    int checkBankBalance(int money);
    //add money
    boolean addMoney(int money);
    //get roi
    int getROI();
    //get total interest
    int getTotalInterest(int amount, int time);
}
