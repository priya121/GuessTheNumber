import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessTheNumberTest {

    @Test
    public void returnsFalseIfGuessedNumberDoesNotMatch() {
        assertEquals(false, GuessTheNumber.isMatch(1));
    }

    @Test
    public void returnsTrueIfGuessedNumberMatches() {
        assertEquals(true, GuessTheNumber.isMatch(2));
    }

}