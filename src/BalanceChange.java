
public class BalanceChange {

     public static int Change() {

        int arrayadaptor = 2;

        int[] BalanceList = new int[11];

        BalanceList[0] = 250;
        BalanceList[1] = - 100;
        BalanceList[2] = 100;
        BalanceList[3] = - 20;
        BalanceList[4] = 180;
        BalanceList[5] = 0;
        BalanceList[6] = - 70;
        BalanceList[7] = 60;
        BalanceList[8] = - 80;
        BalanceList[9] = - 50;
        BalanceList[10] = 650;

        int turnbalance = BalanceList[Board.getboardPosition() - arrayadaptor];

        return turnbalance;
    }
}