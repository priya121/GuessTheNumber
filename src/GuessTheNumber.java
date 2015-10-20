public class GuessTheNumber {
    private final int number;

    public GuessTheNumber(int number) {
        this.number = number;
    }

    public boolean isMatch(int guessed) {
        if (guessed == number) {
            return true;
        }
        return false;
    }
}
