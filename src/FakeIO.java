import java.util.LinkedList;
import java.util.List;

public class FakeIO implements IOInterface {
   private LinkedList<Integer> numbers;

    public FakeIO(List<Integer> guessedNumbers) {
        this.numbers = new LinkedList<>(guessedNumbers);
    }

    @Override
    public int getInput() {
        return numbers.pop();
    }



}

