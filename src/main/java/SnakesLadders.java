public class SnakesLadders {
    Player player1, player2;
    Player playerWithTurn;

    public SnakesLadders() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
        this.playerWithTurn = player1;
    }

    public String play(int die1, int die2) {
        playerWithTurn.advance(die1, die2);
        String playerState = playerWithTurn.keepPlaying();
        if(playerWithTurn == player1){
            playerWithTurn = player2;
        }else{
            playerWithTurn = player1;
        }
        return playerState;
    }
}
