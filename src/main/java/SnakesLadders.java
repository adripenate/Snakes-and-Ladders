public class SnakesLadders {
    private Player player1, player2;
    private Player playerWithTurn;

    public SnakesLadders() {
        this.player1 = new Player(1, 100);
        this.player2 = new Player(2, 100);
        this.playerWithTurn = player1;
    }

    public String play(int die1, int die2) {
        playerWithTurn.advance(die1, die2);
        if(playerIsInLadderSquare()) playerWithTurn.advanceTo(getLadderEndSquare());
        if (playerIsInSnakeSquare()) playerWithTurn.advanceTo(getSnakeEndSquare());
        String playerState = playerWithTurn.keepPlaying();
        playerWithTurn = whoseTurnIsIt(die1, die2) ? player1 : player2;
        return playerState;
    }

    private Integer getSnakeEndSquare() {
        return Snakes.getEndSquare(getActualSquare());
    }

    private boolean playerIsInSnakeSquare() {
        return Snakes.isSnakeSquare(getActualSquare());
    }

    private Integer getLadderEndSquare() {
        return Ladders.getEndSquare(getActualSquare());
    }

    private boolean playerIsInLadderSquare() {
        return Ladders.isLadderSquare(getActualSquare());
    }

    private int getActualSquare() {
        return playerWithTurn.getPosition();
    }

    private boolean whoseTurnIsIt(int die1, int die2) {
        return areDiesEqual(die1, die2) == isFirstPlayerTurn();
    }

    private boolean areDiesEqual(int die1, int die2) {
        return die1==die2;
    }

    private boolean isFirstPlayerTurn() {
        return playerWithTurn == player1;
    }
}
