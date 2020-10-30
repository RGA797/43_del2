//This class' main functionality is giving a random number of dice cast
//Here, one should be able to easily change the properties of the dice by changing the local variables maxEye and minEye in the rollice method
public class Dice {
    int DiceTotal;

    public void setDiceTotal(int dicetotal) {
        DiceTotal = dicetotal;
    }

    public int getDiceTotal() {
        return DiceTotal;
    }

    public static int rollDice() {
        int maxEye = 6;
        int minEye = 1;
        return (int) ((Math.random() * maxEye) + minEye);
    }

    public static int diceTotal() {
        int roll1 = rollDice();
        int roll2 = rollDice();
        return roll1 + roll2;
    }
}