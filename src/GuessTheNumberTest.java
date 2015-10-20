import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessTheNumberTest {

    @Test
    public void checksIfNumberMatches() {
       assertEquals(true, GuessTheNumber.isMatch(2));
    }

    @Test
    public void checksNumberDoesNotMatch() {
        assertEquals(false, GuessTheNumber.isMatch(4));
    }

}

