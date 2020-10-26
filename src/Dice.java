
public class Dice {

    /*public static int[] RollDicePlayer1() {
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
    }*/


    public static int rollDice() {
        int maxEye = 6;
        int minEye = 1;

        return (int) ((Math.random() * maxEye) + minEye);
    }

    public static int diceTotal() {
        int roll1 = rollDice();
        int roll2 = rollDice();

        int rollTotal = roll1 + roll2;

        System.out.println("Total roll: " + rollTotal);

        return roll1 + roll2;
    }
}