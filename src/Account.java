public class Account {
    int totalBalance = 0;
    int balanceToWin = 3000;
    int change;

    public Account(int totalBalance, int balanceToWin){
        this.totalBalance = totalBalance;
        this.balanceToWin = balanceToWin;
    }
    public void changeBalance(int change){
        totalBalance = totalBalance + change;
    }
    public int getTotalBalance(){
        return totalBalance;
    }
    public boolean winCondition(){
        if(totalBalance >= balanceToWin){
            return true;
        }
        else{
            return false;
        }
    }
}
