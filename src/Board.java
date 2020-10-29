//This class keeps track of 3 arrays describing the properties of a board of 11 positions.
//An instance variable (board position) keeps track of a pieces position on the board, and can change with a given value.
//Boardposition resets if it goes over the boards boundaries
//As these arrays have index 0-10, we use an arrayadaptor to translate between boardPosition and the respective index
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
        return boardPosition;
    }

    public void updateBoardPosition(int dicetotal) {
        int fieldmax = 12;
        int fieldreset = 11;
        setboardPosition(dicetotal + getboardPosition());
        while (getboardPosition() > fieldmax) {
            setboardPosition(boardPosition - fieldreset);
        }
    }

    public String getFieldName() {
        final String[] fieldNameList = new String[]{"Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery", "Black cave", "Huts in the mountain", "The Werewall", "The pit", "Goldmine"};
        return fieldNameList[getboardPosition() - arrayadaptor];
    }

    public int getFieldValue() {
        final int[] BalanceList = new int[]{250, -100, 100 , -20, 180, 0, -70, 60, -80, -50, 650};
        return BalanceList[getboardPosition() - arrayadaptor];
    }
    public String getFieldText() {
        final String[] fieldTextList = new String[]{
                "You find an abandoned tower full of valuables and equipment.",
                "You landed in a massive crater, you must expend great effort to get out.",
                "You reach a gilded palace, it's wealthy inhabitants graciously supply you with provisions.",
                "You are left with no other option but to travel through the cold and barren desert.",
                "You enter a fortified city, within the safety of the tall walls you gather your strength and supplies.",
                "You come across a monastery, you're safe but unfortunately there's nothing to gain here.",
                "You travel through a black cave in which you get lost.",
                "Traveling over the mountains you find a series of huts, the locals are happy to help any way they can.",
                "You are forced to cross the dreaded Werewall, you must run for your life!",
                "You fall into a pit, you must struggle to get out.",
                "You discover an abandoned gold mine, it's filled with gold, you're rich!"
        };
        return fieldTextList[getboardPosition() - arrayadaptor];
    }

}

