
public class Board {
    int arrayadaptor = 2;
    int boardPosition;

    public Board() {
        this.boardPosition = 0;
    }

    public void setboardPosition(int position) {
        boardPosition = position;
    }

    public int getboardPosition() {
        //if (boardPosition == 0){
         //   boardPosition = 2;
        //}
        //System.out.println("Board position: " + boardPosition);
        return boardPosition;
    }

    public void ChangeBoardPosition(int dicetotal) {
        int fieldmax = 12;
        int fieldreset = 11;
        setboardPosition(dicetotal + getboardPosition());
        while (getboardPosition() > fieldmax) {
            setboardPosition(boardPosition - fieldreset);
        }
    }

    public String GetFieldName() {
        final String[] fieldNameList = new String[]{"Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery", "Black cave", "Huts in the mountain", "The Werewall", "The pit", "Goldmine"};
        return fieldNameList[getboardPosition() - arrayadaptor];
    }

    public int GetFieldChange() {
        final int[] BalanceList = new int[]{250, -100, 100 ,  -20, 180, 0, -70, 60, -80, -50, 650};
        return BalanceList[getboardPosition() - arrayadaptor];
    }
}

