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
        System.out.println("Are you player 1 or player 2?");
        int playerType = in.nextInt();
        switch (playerType) {
            case 1 -> {
                System.out.println("Write your name");
                playername1 = in.nextLine();
                in.nextLine(); //consume newline left-over
                System.out.println("Write player 2's name");
                playername2 = in.nextLine();
            }
            case 2 -> {
                System.out.println("Write your name");
                playername2 = in.nextLine();
                in.nextLine(); //consume newline left-over
                System.out.println("Write player 1's name");
                playername1 = in.nextLine();
            }
        }

        Player player1 = new Player(1, playername1);
        Player player2 = new Player(2, playername2);

        int i = 1;

        while ((!account1.winCondition()) && (!account2.winCondition())) {
            if (i < 1000) {
                if (i % 2 == 1) {
                    //player1turn
                    System.out.println("Player" + "" + player1.playerType + "'s" + "turn");
                    piece1.ChangeBoardPosition(Dice.diceTotal());
                    System.out.println("Landed on " + piece1.GetFieldName() + " giving " + "" + piece1.GetFieldChange());
                    account1.changeBalance(piece1.GetFieldChange());
                    while (piece1.getboardPosition() == 10) {
                        System.out.println("Current money on werewall: " + "" + account1.getTotalBalance());
                        System.out.println("Rolling again..");
                        System.out.println(" ");
                        //rolling
                        piece1.ChangeBoardPosition(Dice.diceTotal());
                        account1.changeBalance(piece1.GetFieldChange());
                        if (piece1.getboardPosition() != 10) {
                            System.out.println("Landed on " + piece1.GetFieldName() + " giving " + "" + piece1.GetFieldChange());
                        }
                    }
                    System.out.println("Turn ended with: " + "" + account1.getTotalBalance());
                    System.out.println(" ");
                }
                if (i % 2 == 0) {
                    //player2turn
                    System.out.println("Player" + "" + player2.playerType + "'s" + "turn");
                    piece2.ChangeBoardPosition(Dice.diceTotal());
                    System.out.println("Landed on " + piece2.GetFieldName() + " giving" + "" + piece2.GetFieldChange());
                    account2.changeBalance(piece2.GetFieldChange());
                    while (piece2.getboardPosition() == 10) {
                        System.out.println("Current money on werewall: " + "" + account2.getTotalBalance());
                        System.out.println("Rolling again..");
                        System.out.println(" ");
                        //rolling
                        piece2.ChangeBoardPosition(Dice.diceTotal());
                        account2.changeBalance(piece2.GetFieldChange());
                        if (piece2.getboardPosition() != 10) {
                            System.out.println("Landed on " + piece2.GetFieldName() + " giving" + "" + piece2.GetFieldChange());
                        }
                    }
                    System.out.println("Turn ended with: " + "" + account2.getTotalBalance());
                    System.out.println(" ");
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
                equals("Yes"))
            //restart game?
            System.exit(0);
    }
}
