import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleIO implements IOInterface {
    private final BufferedReader inputChannel;

    public ConsoleIO (InputStream inputChannel){
        this.inputChannel = new BufferedReader(new InputStreamReader(inputChannel));
    }

    @Override
    public Integer getInput() {
        try {
             return Integer.parseInt(inputChannel.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
