public class Account {
    int totalBalance;
    int balanceToWin;
    int change;

    public Account(int totalBalance, int balanceToWin){
        this.totalBalance = 0;
        this.balanceToWin = 3000;
    }
    public void changeBalance(int change){
        totalBalance = totalBalance + change;
    }
    public int getTotalBalance(){
        return totalBalance;
    }
    public boolean winCondition(){
        return totalBalance >= balanceToWin;
    }
}
