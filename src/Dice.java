
public class Dice {

    public static int[] RollDicePlayer1() {
        //Method that returns an array with 2 random numbers between 1 and 6. (Player 1)
        int[] Player1Dice = new int[2];

        int diceCount = 2;
        int maxEye = 6;
        int minEye = 1;
        int range = maxEye - minEye + 1;

        Player1Dice[0] = (int)(Math.random()*range) + minEye;
        Player1Dice[1] = (int)(Math.random()*range) + minEye;

        //System.out.println(Player1Dice[0]);
        //System.out.println(Player1Dice[1]);
        return Player1Dice;

    }
    public static int[] RollDicePlayer2() {
        // Method that returns an array with 2 random numbers between 1 and 6. (Player 2)
        int[] Player2Dice = new int[2];

        int diceCount = 2;
        int maxEye = 6;
        int minEye = 1;
        int range = maxEye - minEye + 1;

        Player2Dice[0] = (int) (Math.random() * range) + minEye;
        Player2Dice[1] = (int) (Math.random() * range) + minEye;
        return Player2Dice;
    }

    /*public static void main(String[] args) {

        System.out.println(RollDicePlayer1()[0]);
        System.out.println(RollDicePlayer1()[0]);
        System.out.println(RollDicePlayer1()[0]);
        System.out.println(RollDicePlayer1()[0]);
    } */
}