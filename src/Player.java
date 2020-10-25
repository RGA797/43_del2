public class Player {
    int playerCount = 2;
    int playerType;
    String playerName;
    String n_name; // new name
    int playerPosition;

    public Player(int playerType, String playerName) {
        this.playerType = playerType;
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }
    public String NewPlayerName(String n_name) {
        playerName = n_name;
        return playerName;
    }
}
