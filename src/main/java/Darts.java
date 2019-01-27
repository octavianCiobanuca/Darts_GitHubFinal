public class Darts {
    //Darts class in Master with change
    //Darts_initial
    enum Multiplier {
        DOUBLE, TRIPLE, XX;
    }
    private int score = 301;
    private int dartsLeft = 3;
    private boolean isFinished = false;
    private int turn = 1;
    private int lastTurnScore = score;

    public int score() {
        return score;
    }

    public boolean isFinished() {
        return isFinished;
    }
    public int dartsLeft() {
        return dartsLeft;
    }

    public int turn() {
        return turn;
    }

    public void darts(int throwScore) {
        updateDartBoard(throwScore, null);
    }

}
