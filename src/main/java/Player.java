public class Player {
    public static final int START_POSITION = 0;
    private int position;
    private int numberOfPlayer;
    private int goal;

    public Player(int numberOfPlayer, int goal) {
        this.position = START_POSITION;
        this.goal = goal;
        this.numberOfPlayer = numberOfPlayer;
    }

    public void advance(int die1, int die2) {
        this.position += die1+die2;
        if(this.position > goal) this.position = goal - (this.position - goal);
    }

    public String getPlayerState() {
        if(playerHasReachedGoal()) return "Player " + numberOfPlayer + " Wins!";
        return "Player " + numberOfPlayer + " is on square " + position;
    }

    private boolean playerHasReachedGoal() {
        return position == goal;
    }

    public int getPosition() {
        return position;
    }

    public void advanceTo(int position) {
        this.position = position;
    }
}
