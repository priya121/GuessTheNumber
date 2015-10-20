import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ConsoleIOTest {

    @Test
    public void takesAnInput() {
        InputStream input = new ByteArrayInputStream("2\n".getBytes());
        ConsoleIO newInput = new ConsoleIO(input);
        assertEquals(2, (newInput.getInput()));
    }
}
