import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheNumberTest {
    GuessTheNumber newGame = new GuessTheNumber(2);

    @Test
    public void checksIfNumberMatches() {
        assertTrue(newGame.isMatch(2));
    }

    @Test
    public void checksNumberDoesNotMatch() {
        assertFalse(newGame.isMatch(4));
    }

}

