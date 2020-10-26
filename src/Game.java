
import java.util.Scanner;

public class Game {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            Account account1 = new Account();
            Account account2 = new Account();
            Board piece1 = new Board();
            Board piece2 = new Board();
            System.out.println("Are you player 1 or player 2?");
            int playerType = in.nextInt();
            String playername1;
            String playername2;
            switch (playerType) {
                case 1 -> {
                    System.out.println("write your name");
                    playername1 = in.nextLine();
                    System.out.println("Write player 2's name");
                    playername2 = in.nextLine();
                }
                case 2 -> {
                    System.out.println("write your name");
                    playername2 = in.nextLine();
                    System.out.println("Write player 1's name");
                    playername1 = in.nextLine();
                }
            }
            Player player1 = new Player(1,playername1);
            Player player2 = new Player(2,playername2);


        }
    }
