public class Player {
    int position;
    int numberOfPlayer;

    public Player(int numberOfPlayer) {
        this.position = 0;
        this.numberOfPlayer = numberOfPlayer;
    }

    public void advance(int die1, int die2) {
        this.position += die1+die2;
    }

    public String keepPlaying() {
        return "Player " + numberOfPlayer + " is on square " + position;
    }
}
