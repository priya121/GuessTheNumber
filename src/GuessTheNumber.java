public class GuessTheNumber {
    private final int number;
    private boolean isOver = false;

    public GuessTheNumber(IOInterface io, int number) {
        this.number = number;
    }

    public boolean isMatch(int guessed) {
        if (guessed == number) {
            return true;
        }
        return false;
    }

    public boolean gameLoop(int guessedNumber) {
            if (isMatch(guessedNumber)) {
              isOver = true;
            }
        return isOver;
    }
}
