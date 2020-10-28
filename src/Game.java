import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        String playername1 = "";
        String playername2 = "";
        Scanner in = new Scanner(System.in);
        Account account1 = new Account();
        Account account2 = new Account();
        Board piece1 = new Board();
        Board piece2 = new Board();
        Player player1 = new Player(1, playername1);
        Player player2 = new Player(2, playername2);
        int i = 1;

        System.out.println("Are you player 1 or player 2?");
        int playerType = in.nextInt();
        switch (playerType) {
            case 1 -> {
                namePlayer(player1,player2);
            }
            case 2 -> {
                namePlayer(player2, player1);
            }
        }


        while ((!account1.winCondition()) && (!account2.winCondition())) {
            if (i < 100) {
                if (i % 2 == 1) {

                    playTurn(account1, piece1, player1);
                }
                else {
                    playTurn(account2, piece2, player2);
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
        System.out.println("Play again?");
        if (in.nextLine().
                equals("yes"))
            //restart game?
            System.exit(0);
        }

    private static void playTurn(Account account, Board piece, Player player) {
        //player turn
        System.out.println(player.getPlayerName() + "'s turn");
        piece.ChangeBoardPosition(Dice.diceTotal());
        System.out.println("Landed on " + piece.GetFieldName() + " giving " + "" + piece.GetFieldChange());
        account.changeBalance(piece.GetFieldChange());
        while (piece.getboardPosition() == 10) {
            System.out.println("Current money on werewall: " + "" + account.getTotalBalance());
            System.out.println("Rolling again..");
            System.out.println(" ");
            //rolling
            piece.ChangeBoardPosition(Dice.diceTotal());
            account.changeBalance(piece.GetFieldChange());
            if (piece.getboardPosition() != 10) {
                System.out.println("Landed on " + piece.GetFieldName() + " giving" + "" + piece.GetFieldChange());
            }
        }
        System.out.println("Turn ended with: " + "" + account.getTotalBalance());
        System.out.println(" ");
    }
    private static void namePlayer(Player playerNumber1, Player playerNumber2) {

        System.out.println("Write your name");
        in.nextLine(); //consume newline left-over
        playerNumber1.setPlayerName(in.nextLine());
        System.out.println("Write player 2's name");
        playerNumber2.setPlayerName(in.nextLine());

    }
}

