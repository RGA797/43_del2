import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        String playername1 = "";
        String playername2 = "";
        Scanner in = new Scanner(System.in);
        Dice dicetotal1 = new Dice();
        Dice dicetotal2 = new Dice();
        Account account1 = new Account();
        Account account2 = new Account();
        Board piece1 = new Board();
        Board piece2 = new Board();
        Player player1 = new Player(1, playername1);
        Player player2 = new Player(2, playername2);
        int i = 1;

        System.out.println("Are you player 1 or player 2?");


        while (!in.hasNextInt()) {
            System.out.println("please write 1 or 2");
            in.nextLine();
        }

        int playerType = in.nextInt();
        switch (playerType) {
            case 1 -> {
                namePlayer(player1, player2);
            }
            case 2 -> {
                namePlayer(player2, player1);
            }
        }
        while ((!account1.winCondition()) && (!account2.winCondition())) {
            if (i < 100) {
                if (i % 2 == 1) {

                    playTurn(dicetotal1, account1, piece1, player1);
                }
                else {
                    playTurn(dicetotal2, account2, piece2, player2);
                }
            }
            if (account2.winCondition()) {
                System.out.println(player2.getPlayerName() + " won!");
                System.out.println(" ");
                break;
            }
            if (account1.winCondition()) {
                System.out.println(player1.getPlayerName() + " won!");
                System.out.println(" ");
                break;
            }
            i++;
        }
    }

    private static void playTurn(Dice dicetotal, Account account, Board piece, Player player) {
        //player turn
        System.out.println(player.getPlayerName() + "'s turn");
        dicetotal.setDiceTotal(Dice.diceTotal());
        piece.ChangeBoardPosition(dicetotal.getDiceTotal());
        System.out.println("rolled " + "" + dicetotal.getDiceTotal());
        System.out.println("Landed on " + piece.GetFieldName() + " giving " + "" + piece.GetFieldChange());
        account.changeBalance(piece.GetFieldChange());
        while (piece.getboardPosition() == 10) {
            System.out.println("Current money on werewall: " + "" + account.getTotalBalance());
            System.out.println("Rolling again..");
            System.out.println(" ");
            //rolling
            piece.ChangeBoardPosition(dicetotal.getDiceTotal());
            account.changeBalance(piece.GetFieldChange());
            if (piece.getboardPosition() != 10) {
                System.out.println("Landed on " + piece.GetFieldName() + " giving " + "" + piece.GetFieldChange());
            }
        }
        System.out.println("Turn ended with: " + "" + account.getTotalBalance());
        System.out.println(" ");
    }
    private static void namePlayer(Player first, Player last) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write your name");
        while (!in.hasNextLine()){
            System.out.println("invalid input");
            in.nextLine();
        }
        String firstName = in.nextLine();
        first.setPlayerName(firstName);
        if (first.playerType == 2){
        System.out.println("Write player 1's name");
        }
        if (first.playerType == 1){
            System.out.println("Write player 2's name");
        }
        while (!in.hasNextLine()){
            System.out.println("please write 1 or 2");
            in.nextLine();
        }
        String lastName = in.nextLine();
        last.setPlayerName(lastName);
    }
}

