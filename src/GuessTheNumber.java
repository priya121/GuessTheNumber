public class GuessTheNumber {
    private int tries;
    private final int number;
    private boolean isOver = false;
    private IO io;
    private int input;

    public GuessTheNumber(IO io, int number) {
        this.number = number;
        this.io = io;
        this.tries = 1;
    }

    public boolean isMatch(int guessed) {
        if (guessed == number || tries == 6) {
            return isOver = true;
        }
        return isOver;
    }

    public boolean gameLoop() {
        do {
            input = io.getInput();
            tries += 1;
        }
        while (!isMatch(input));
        return isOver;
    }
}
