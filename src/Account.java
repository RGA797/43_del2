public class Account {
    int totalBalance;
    int balanceToWin = 3000;
    int change;

    public Account(int totalBalance, int balanceToWin){
        this.totalBalance = totalBalance;
        this.balanceToWin = balanceToWin;
    }
    public void changeBalance(int change){
        totalBalance = totalBalance + change;
    }
}
