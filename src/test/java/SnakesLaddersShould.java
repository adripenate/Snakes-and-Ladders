import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SnakesLaddersShould {

    @Test
    public void follow_the_numbers_and_go_to_position_number_four() {
        int die1 = 2, die2 = 2;
        String expectedOutput = "Player 1 is on square 4";
        SnakesLadders game = new SnakesLadders();

        assertThat(game.play(die1, die2)).isEqualTo(expectedOutput);
    }

    @Test
    public void remember_last_position() {
        int die1 = 1, die2 = 2;
        String expectedOutput = "Player 1 is on square 3";
        SnakesLadders game = new SnakesLadders();

        assertThat(game.play(die1, die2)).isEqualTo(expectedOutput);

        game.play(die1, die2);

        die1 = 1;
        die2 = 1;
        expectedOutput = "Player 1 is on square 5";

        assertThat(game.play(die1, die2)).isEqualTo(expectedOutput);
    }

    @Test
    public void have_two_players() {
        int die1 = 1, die2 = 2;
        String expectedOutput = "Player 1 is on square 3";
        SnakesLadders game = new SnakesLadders();

        assertThat(game.play(die1, die2)).isEqualTo(expectedOutput);

        die1 = 1;
        die2 = 2;
        expectedOutput = "Player 2 is on square 3";

        assertThat(game.play(die1, die2)).isEqualTo(expectedOutput);
    }

    @Test
    public void make_player_have_another_go_when_dies_are_equal() {
        int die1 = 2, die2 = 2;
        String expectedOutput = "Player 1 is on square 4";
        SnakesLadders game = new SnakesLadders();

        assertThat(game.play(die1, die2)).isEqualTo(expectedOutput);

        die1 = 1;
        die2 = 1;
        expectedOutput = "Player 1 is on square 6";

        assertThat(game.play(die1, die2)).isEqualTo(expectedOutput);
    }

    @Test
    public void climb_up_ladders() {
        int die1 = 4, die2 = 3;
        String expectedOutput = "Player 1 is on square 14";
        SnakesLadders game = new SnakesLadders();

        assertThat(game.play(die1, die2)).isEqualTo(expectedOutput);
    }

}