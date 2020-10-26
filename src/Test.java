public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("2 field position: " + Board.BoardField(Dice.diceTotal()));
            System.out.println("3 " + Board.FieldName());

            Account.changeBalance(BalanceChange.Change());
            System.out.println("4 total balance: " + Account.getTotalBalance());

        }
    }

}
