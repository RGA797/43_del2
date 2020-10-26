
public class Account {
    int totalBalance;
    int balanceToWin;
    public Account(){
        this.totalBalance = 0;
        this.balanceToWin = 3000;
    }
    public void changeBalance(int change){
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