import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SnakesLaddersShould {

    @Test
    public void follow_the_numbers_and_go_to_position_number_three() {
        int die1 = 1, die2 = 2;
        String expectedOutput = "Player 1 is on square 3";

        assertThat(SnakesLadders.play(die1, die2)).isEqualTo(expectedOutput);
    }

    @Test
    public void follow_the_numbers_and_go_to_position_number_four() {
        int die1 = 2, die2 = 2;
        String expectedOutput = "Player 1 is on square 4";

        assertThat(SnakesLadders.play(die1, die2)).isEqualTo(expectedOutput);
    }
}