public class Player {
    // Player object, this is set when the game starts.
    public Player(int playerType, String playerName) {
        this.playerType = playerType;
        this.playerName = playerName;
        this.playerPosition = 2;
    }

    // User choses player type (player 1/player 2)
    int playerType;
    String playerName;
    String n_name; // new name
    int playerPosition;

    // The total count of players.
    public int playerCount() {
        return 2;
    }
    public String getPlayerName() {
        return playerName;
    }

    // Set a players name to something the user specified.
    public String NewPlayerName(String n_name) {
        playerName = n_name;
        return playerName;
    }

    // Set a players position, default is 2 when the game starts.
    public void setPlayerPosition(int pos) {
        playerPosition = pos;
    }

    // Get player position (help function for board)
    public int getPlayerPosition() {
        return playerPosition;
    }
}
