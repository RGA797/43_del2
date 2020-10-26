
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
            switch (playerType){
                case playerType = 1:
                    System.out.println("skriv dit navn");
                    playername1 = in.nextLine();
                    System.out.println("Write player2's name");
                    playername2 = in.nextLine();
                    break;
                case playerType = 2:
                    System.out.println("Write player 2's name");
                    playername1 = in.nextLine();
                    System.out.println("Write player 1 name");
                    playername2 = in.nextLine();
                    break;
            }

            int playerType = in.nextInt();
            System.out.println("What is" +  " "+playerType+'s' + " name?" );
            if (playerType = 1){
                String playername1 = in.nextLine()
            }
            if (playerType = 2){

            }
            String playerName = in.nextLine();

            Player player1 = new Player(playerType,playerName);


        }
    }
