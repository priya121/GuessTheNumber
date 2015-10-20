import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class GuessTheNumberTest {
    GuessTheNumber newGame;

    @Test
    public void checksIfNumberMatches() {
        assertTrue(newGame.isMatch(2));
    }

    @Test
    public void checksNumberDoesNotMatch() {
        assertFalse(newGame.isMatch(4));
    }

    @Test
    public void usesFakeIOToGetInput() {
        FakeIO io = new FakeIO(asList(1));
        assertEquals(false, newGame.gameLoop());
    }

    @Test
    public void usesFakeIOToGetListInput() {
        FakeIO io = new FakeIO(asList(1, 2));
        assertEquals(false, newGame.gameLoop());
    }

    @Test
    public void gameLoopTakesMultipleInput() {
        FakeIO io = new FakeIO(asList(1, 1, 1, 1, 1, 1, 1));
        newGame = new GuessTheNumber(io, 2);
        assertEquals(true, newGame.gameLoop());
    }
}

