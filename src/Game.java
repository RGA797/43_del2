
import java.util.Scanner;

public class Game {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            Account account1 = new Account();
            Account account2 = new Account();
            Board piece1 = new Board();
            Board piece2 = new Board();

            int playerType = in.nextInt();

            String playerName = in.nextLine();



            Player player1 = new Player(playerType,playerName);


        }
    }
