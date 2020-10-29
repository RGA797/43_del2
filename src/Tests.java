import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class Tests {

    @Test
    void updateBalanceTest() {
        Account account1 = new Account();
        account1.updateBalance(-1100);
        assertEquals(0, account1.getTotalBalance());
    }

    @Test
    void updateBoardPositionTest() {
        Board piece = new Board();
        piece.updateBoardPosition(12);
        assertEquals(12, piece.getboardPosition());
    }

    @Test
    void getFieldNameTest() {
        Board piece = new Board();
        // System.out.println("Landed on " + piece.getFieldName() + " giving " + "" + piece.getFieldValue());
        piece.updateBoardPosition(2);
        assertEquals("Tower", piece.getFieldName());
    }

    @Test
    void setDiceTotalTest() {
        Dice d = new Dice();
        d.setDiceTotal(10);
        assertEquals(10, d.getDiceTotal());
    }

    @Test
    void getPlayerNameTest() {
        Player p = new Player(1, "dsa");
        assertEquals("dsa", p.getPlayerName());
    }

    @Test
    void setPlayerNameTest() {
        Player p = new Player(1, "dsa");
        p.setPlayerName("asd");
        assertEquals("asd", p.getPlayerName());
    }

    // Lowest value
    @Test
    void playTurnLowestTest() {
        Dice dicetotal = new Dice();
        Account account = new Account();
        Board piece = new Board();
        Player player = new Player(1, "asd");

        dicetotal.setDiceTotal(2);
        assertEquals(2, dicetotal.getDiceTotal());

        piece.updateBoardPosition(dicetotal.getDiceTotal());
        assertEquals(2, piece.getboardPosition());

        assertEquals("Tower", piece.getFieldName());

        assertEquals(250, piece.getFieldValue());

        account.updateBalance(piece.getFieldValue());
        assertEquals(1250, account.getTotalBalance());
    }

    // Max value
    @Test
    void playTurnHighestTest() {
        Dice dicetotal = new Dice();
        Account account = new Account();
        Board piece = new Board();
        Player player = new Player(1, "asd");

        dicetotal.setDiceTotal(12);
        assertEquals(12, dicetotal.getDiceTotal());

        piece.updateBoardPosition(dicetotal.getDiceTotal());
        assertEquals(12, piece.getboardPosition());

        assertEquals("Goldmine", piece.getFieldName());

        assertEquals(650, piece.getFieldValue());

        account.updateBalance(piece.getFieldValue());
        assertEquals(1650, account.getTotalBalance());
    }
}