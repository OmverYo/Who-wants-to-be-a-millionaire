package assignment.pkg1;

/**
 * This class controls the score, coins and a condtion of the game
 * @author Justin Lee 17989311
 */

public class ScoreAndCoin {
    //Creating variables
    private int score = 0;
    private int coin = 100;
    private boolean victory;
    private int loseStreak = 0;
    
    //Getters and setters
    public int getScore() {
        return score;
    }

    //Setting a condition to win the game
    public void setScore(int score) {
        if (score < 0)
        {
            score = 0;
        }
        else if (score >= 10)
        {
            victory = true;
        }
        this.score = score;
    }

    public int getCoin() {
        return coin;
    }
    
    //Setting a condition to lose the game
    public void setCoin(int coin) {
        if (coin <= 0)
        {
            victory = false;
        }
        this.coin = coin;
    }
    
    public boolean isVictory() {
        return victory;
    }

    public void setVictory(boolean victory) {
        this.victory = victory;
    }

    public int getLoseStreak() {
        return loseStreak;
    }
    
    //Adds a lose streak if the user's answer is wrong
    public int addLoseStreak() {
        loseStreak += 1;
        
        return loseStreak;
    }

    //Sets a condition to lose if the user's answer is incorrect 3 times in a row
    public void setLoseStreak(int loseStreak) {
        if (loseStreak >= 3) {
            coin = 0;
        }
        this.loseStreak = loseStreak;
    }
    
    //Adds a score
    public int addScore() {
        score += 1;
        
        return score;
    }
    
    //Removes a coin
    public int removeCoin() {
        coin -= 1;
        
        return coin;
    }
    
    //toString overriding to display the current score and credit.
    @Override
    public String toString() {
        return "Your score is now: "+this.score+" and you have "+this.coin+" coins left.";
    }
}