package assignment.pkg1;

import java.util.Random;

/**
 * This class generates random question number
 * @author Justin Lee 17989311
 */

public class QuestionNumber {
    Random rand = new Random();
    private int number;
    private int range = 30;
    
    //Getters and Setters
    public int getNumber() {
        //To make the number range to 1 ~ 30
        number = rand.nextInt(this.range);
        number += 1;
        
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int minusRange() {
        range -= 1;
        
        return range;
    }
    
    public int getRange() {
        return range;
    }
    
    public void setRange(int range) {
        this.range = range;
    }
}