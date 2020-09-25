public class SnakesLadders {
    int positionPlayer1 = 0, positionPlayer2 = 0;
    boolean player1Turn = true;

    public String play(int die1, int die2) {
        if(player1Turn){
            this.positionPlayer1 += die1+die2;
            player1Turn = false;
            return "Player 1 is on square " + positionPlayer1;
        }else{
            this.positionPlayer2 += die1+die2;
            player1Turn = true;
            return "Player 2 is on square " + positionPlayer2;
        }
    }
}
