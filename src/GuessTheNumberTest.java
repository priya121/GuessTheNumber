import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class GuessTheNumberTest {
    FakeIO io = new FakeIO(asList(1));
    GuessTheNumber newGame = new GuessTheNumber(io, 2);

    @Test
    public void checksIfNumberMatches() {
        assertTrue(newGame.isMatch(2));
    }

    @Test
    public void checksNumberDoesNotMatch() {
        assertFalse(newGame.isMatch(4));
    }

    @Test
    public void usesFakeIOToGetListInput() {
        FakeIO io = new FakeIO(asList(1, 2));
        newGame = new GuessTheNumber(io, 2);
        assertEquals(true, newGame.gameLoop());
    }

    @Test
    public void gameLoopTakesMultipleInput() {
        FakeIO io = new FakeIO(asList(1, 1, 1, 1, 1, 1, 1));
        newGame = new GuessTheNumber(io, 2);
        assertEquals(true, newGame.gameLoop());
    }
}