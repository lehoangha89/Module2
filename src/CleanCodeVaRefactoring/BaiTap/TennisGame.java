package CleanCodeVaRefactoring.BaiTap;

public class TennisGame {
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final int LOVE_NUMBER = 0;
    public static final int FIFTEEN_NUMBER = 1;
    public static final int THIRTY_NUMBER = 2;
    public static final int FORTY_NUMBER = 3;

    public static String getScore(String FistPlayerName, String SecondPlayerName, int FistPlayerScore, int SecondPlayerScore) {
        String score = "";
        int tempScore = LOVE_NUMBER;
        boolean isScoreEquals = FistPlayerScore == SecondPlayerScore;
        if (isScoreEquals) {
            score = scoreAll(FistPlayerScore);
        } else {
            boolean isAdvanceScore = FistPlayerScore >= 4 || SecondPlayerScore >= 4;
            if (isAdvanceScore) {
                score = checkWin(FistPlayerScore, SecondPlayerScore);
            } else {
                score = calculateScore(FistPlayerScore, SecondPlayerScore, score);
            }
        }
        return score;
    }
    private static String checkWin(int FistPlayerScore, int SecondPlayerScore) {
        String score;
        int minusResult = FistPlayerScore - SecondPlayerScore;
        if (minusResult == FIFTEEN_NUMBER) score = "Advantage player1";
        else if (minusResult == -FIFTEEN_NUMBER) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
    private static String calculateScore(int FistPlayerScore, int SecondPlayerScore, String score) {
        int tempScore;
        for (int i = FIFTEEN_NUMBER; i < FORTY_NUMBER; i++) {
            if (i == FIFTEEN_NUMBER) tempScore = FistPlayerScore;
            else {
                score += "-";
                tempScore = SecondPlayerScore;
            }
            switch (tempScore) {
                case LOVE_NUMBER:
                    score += LOVE;
                    break;
                case FIFTEEN_NUMBER:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case FORTY_NUMBER:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }
    private static String scoreAll(int FistPlayerScore) {
        String score;
        switch (FistPlayerScore) {
            case LOVE_NUMBER:
                score = LOVE_ALL;
                break;
            case FIFTEEN_NUMBER:
                score = FIFTEEN_ALL;
                break;
            case THIRTY_NUMBER:
                score = THIRTY_ALL;
                break;
            case FORTY_NUMBER:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;
        }
        return score;
    }
}