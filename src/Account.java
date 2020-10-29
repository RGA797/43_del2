// Account class meant to be able to keep a bank account, and update it.
// The account class should also be able to give a boolean regarding a set wincondition of 3000
public class Account {
    int totalBalance;
    int balanceToWin;

    public Account(){
        this.totalBalance = 1000;
        this.balanceToWin = 3000;
    }
    public void updateBalance(int change){
        totalBalance = totalBalance + change;

        if (totalBalance < 0) {
            totalBalance = 0;
        }
    }

    public int getTotalBalance(){
        return totalBalance;
    }

    public boolean winCondition(){
        return totalBalance >= balanceToWin;
    }
}