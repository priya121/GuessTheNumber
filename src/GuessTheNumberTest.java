import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class GuessTheNumberTest {
    GuessTheNumber newGame;

    @Before
    public void setUp() throws Exception {
        FakeIO io = new FakeIO(asList(1, 2, 3));
        newGame = new GuessTheNumber(io, 2);
    }

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
        FakeIO io = new FakeIO(asList(1, 2, 3));
        assertEquals(false, newGame.gameLoop(io.getInput()));
    }

    @Test
    public void userFakeIOToGetListInput() {
        FakeIO io = new FakeIO(asList(1, 2, 3));
        assertEquals(false, newGame.gameLoop(io.getInput()));
    }

    @Test
    @Ignore
    public void gameLoopTakesMultipleInput() {
        FakeIO io = new FakeIO(asList(1, 2, 3));
        assertEquals(false, newGame.gameLoop(io.getInput()));
    }
}

