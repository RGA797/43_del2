
public class Account {
    static int totalBalance;
    static int balanceToWin;
    static int change;

    public Account(int totalBalance, int balanceToWin){
        this.totalBalance = 1000;
        this.balanceToWin = 3000;
    }
     public void changeBalance(int change){
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

    public static void main(String[] args) {

        Account w = new Account(1000,3000);

        w.settotalBalance(BalanceChange.Change());

        System.out.println(Account.getTotalBalance());
    }
}