
public class Account {
    static int totalBalance = 1000;
    int balanceToWin;
    static int change;

    public static int updateBalance() {

        changeBalance(BalanceChange.Change());

        return getTotalBalance();
    }

    public Account(int totalBalance, int balanceToWin){
        this.totalBalance = 1000;
        this.balanceToWin = 3000;
    }
     public static void changeBalance(int change){
        totalBalance = totalBalance + change;
    }

    private void settotalBalance(int change) {

        this.totalBalance = totalBalance + change;
    }
    public static int getTotalBalance(){
        return totalBalance;
    }
    public boolean winCondition(){
        return totalBalance >= balanceToWin;
    }


}