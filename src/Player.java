class Player {
    
    private String playerName;
    private int playerAge;
    private String gameType;

    public Player(String playerName, int playerAge, String gameType){
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.gameType = gameType;
    }

    public String GetPlayerName(){
        return playerName;
    }

    public int GetPlayerAge(){
        return playerAge;
    }

    public String GetGameType(){
        return gameType;
    }

}
