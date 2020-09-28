import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {
    Player player1, player2;
    Player playerWithTurn;
    Map<Integer, Integer> ladders = new HashMap<Integer, Integer>()
    {{
        put(2, 38);
        put(7, 14);
    }};

    public SnakesLadders() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
        this.playerWithTurn = player1;
    }

    public String play(int die1, int die2) {
        playerWithTurn.advance(die1, die2);
        if(ladders.containsKey(playerWithTurn.getPosition()))
            playerWithTurn.setPosition(ladders.get(playerWithTurn.getPosition()));
        String playerState = playerWithTurn.keepPlaying();
        playerWithTurn = whoseTurnIsIt(die1, die2) ? player1 : player2;
        return playerState;
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
