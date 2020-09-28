import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {
    private Player player1, player2;
    private Player playerWithTurn;
    Map<Integer, Integer> ladders = new HashMap<Integer, Integer>()
    {{
        put(2, 38);
        put(7, 14);
        put(8, 31);
        put(15, 26);
        put(21, 42);
        put(28, 84);
        put(36, 44);
        put(51, 67);
        put(71, 91);
        put(78, 98);
        put(87, 94);
    }};

    public SnakesLadders() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
        this.playerWithTurn = player1;
    }

    public String play(int die1, int die2) {
        playerWithTurn.advance(die1, die2);
        if(playerIsInLadderSquare())
            playerWithTurn.setPosition(ladders.get(getActualSquare()));
        String playerState = playerWithTurn.keepPlaying();
        playerWithTurn = whoseTurnIsIt(die1, die2) ? player1 : player2;
        return playerState;
    }

    private boolean playerIsInLadderSquare() {
        return ladders.containsKey(getActualSquare());
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
