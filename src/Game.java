import java.util.Scanner;
    public class Game {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Player Player_1 = new Player(1, "bob");
            System.out.println(Player_1.getPlayerName());
            System.out.println(Player_1.NewPlayerName("joe"));
            System.out.println(Player_1.getPlayerPosition());
            // Set a players position to 4, default is 2 when the game starts.
            Player_1.setPlayerPosition(4);
            // Get player position (help function for board)
            System.out.println(Player_1.getPlayerPosition());
        }
    }
