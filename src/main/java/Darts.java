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


    public void darts(int scoreTemp) {
        updateDartBoard(scoreTemp, null);
    }

    public void darts(int i, Multiplier m) {
        int multiplier;
        int scoreTemp;
        switch (m) {
            case DOUBLE:
                multiplier = 2;
                break;
            case TRIPLE:
                multiplier = 3;
                break;
            default:
                multiplier = 1;
                break;
        }
        scoreTemp = multiplier * i;
        updateDartBoard(scoreTemp, m);
    }

    private void updateDartBoard(int scoreTemp, Multiplier m){
        if(dartsLeft==1) {
            turn++;
            dartsLeft = 3;
        } else {
            dartsLeft--;
        }
        int throwScore = score - scoreTemp;
        if(throwScore == 0 && m == Multiplier.DOUBLE){
            isFinished = true;
            score = throwScore;
            return;
        }
        if(throwScore <= 1){
            throwScore = lastTurnScore;

        }
        if(throwScore > 1 && dartsLeft == 3){
            lastTurnScore = throwScore;
        }
        score = throwScore;
    }


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

    


}
