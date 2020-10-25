import java.util.Scanner;
    public class Spil {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Player Player_1 = new Player(1, "bob");
            System.out.println(Player_1.getPlayerName());
            System.out.println(Player_1.NewPlayerName("joe"));
        }
    }
