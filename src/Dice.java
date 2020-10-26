
public class Dice {

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