import java.util.LinkedList;
import java.util.List;

public class FakeIO implements IO {
   private LinkedList<Integer> numbers;

    public FakeIO(List<Integer> guessedNumbers) {
        this.numbers = new LinkedList<>(guessedNumbers);
    }

    @Override
    public Integer getInput() {
        return numbers.pop();
    }
}

