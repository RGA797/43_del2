
public class Board {

    static int boardPosition;

    public static int BoardField(int diceType) {

        int fieldmax = 12;

        int fieldreset = 11;

        Board Position = new Board();

        Position.setboardPosition(diceType + getboardPosition());

        while (getboardPosition() > fieldmax) {

            Position.setboardPosition(boardPosition - fieldreset);
        }

        return getboardPosition();

    }

    private void setboardPosition(int boardPosition) {

        this.boardPosition = boardPosition;
    }

    public static int getboardPosition() {

        return boardPosition;
    }



    public static String FieldName() {

        int arrayadaptor = 2;

        String[] FieldNameList = new String[11];

        FieldNameList[0] = "Tower";
        FieldNameList[1] = "Crater";
        FieldNameList[2] = "Palace gates";
        FieldNameList[3] = "Cold Desert";
        FieldNameList[4] = "Walled city";
        FieldNameList[5] = "Monastery";
        FieldNameList[6] = "Black cave";
        FieldNameList[7] = "Huts in the mountain";
        FieldNameList[8] = "The Werewall";
        FieldNameList[9] = "The pit";
        FieldNameList[10] = "Goldmine";

        String currentfield = FieldNameList[Board.getboardPosition() - arrayadaptor];

        return currentfield;
    }
}

