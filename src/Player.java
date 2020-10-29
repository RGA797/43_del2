public class Player {

    int playerType;
    int playerPosition;
    String playerName;
    // Player object (construction method), this is set when the game starts.
    public Player(int playerType, String playerName) {
        this.playerType = playerType;
        this.playerName = playerName;
        this.playerPosition = 2;
    }
    //returns playername
    public String getPlayerName() {
        return playerName;
    }
    //changes playername
    public void setPlayerName(String newName) {
        playerName = newName;
    }
}
