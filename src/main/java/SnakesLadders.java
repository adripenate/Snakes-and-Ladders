import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {
    private Player player1, player2;
    private Player playerWithTurn;

    Map<Integer, Integer> snakes = new HashMap<Integer, Integer>()
    {{
        put(16, 6);
        put(46, 25);
        put(49, 11);
        put(62, 19);
        put(64, 60);
        put(74, 53);
        put(89, 68);
        put(92, 88);
        put(95, 75);
        put(99, 80);
    }};

    public SnakesLadders() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
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
        return snakes.get(getActualSquare());
    }

    private boolean playerIsInSnakeSquare() {
        return snakes.containsKey(getActualSquare());
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
