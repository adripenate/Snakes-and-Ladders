public class SnakesLadders {
    int position = 0;

    public String play(int die1, int die2) {
        this.position += die1+die2;
        return "Player 1 is on square " + position;
    }
}
