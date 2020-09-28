public class SnakesLadders {
    Player player1, player2;
    boolean player1Turn = true;

    public SnakesLadders() {
        this.player1 = new Player(1);
        this.player2 = new Player(2);
    }

    public String play(int die1, int die2) {
        if(player1Turn){
            player1.advance(die1, die2);
            player1Turn = false;
            return player1.keepPlaying();
        }else{
            player2.advance(die1, die2);
            player1Turn = true;
            return player2.keepPlaying();
        }
    }
}
