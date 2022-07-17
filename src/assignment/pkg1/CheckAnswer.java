package assignment.pkg1;

import java.util.ArrayList;

/**
 * This class stores answers
 * @author Justin Lee 17989311
 */

public class CheckAnswer {
    //Making an array of 30 Answers
    ArrayList<String> CheckArray = new ArrayList<String>();
    
    public CheckAnswer() {
        CheckArray.add("3"); //Answer 1
        CheckArray.add("1"); //Answer 2
        CheckArray.add("2"); //Answer 3
        CheckArray.add("4"); //Answer 4
        CheckArray.add("1"); //Answer 5
        CheckArray.add("2"); //Answer 6
        CheckArray.add("3"); //Answer 7
        CheckArray.add("1"); //Answer 8
        CheckArray.add("4"); //Answer 9
        CheckArray.add("2"); //Answer 10
        CheckArray.add("1"); //Answer 11
        CheckArray.add("2"); //Answer 12
        CheckArray.add("3"); //Answer 13
        CheckArray.add("1"); //Answer 14
        CheckArray.add("1"); //Answer 15
        CheckArray.add("2"); //Answer 16
        CheckArray.add("3"); //Answer 17
        CheckArray.add("3"); //Answer 18
        CheckArray.add("2"); //Answer 19
        CheckArray.add("1"); //Answer 20
        CheckArray.add("3"); //Answer 21
        CheckArray.add("1"); //Answer 22
        CheckArray.add("2"); //Answer 23
        CheckArray.add("3"); //Answer 24
        CheckArray.add("3"); //Answer 25
        CheckArray.add("1"); //Answer 26
        CheckArray.add("4"); //Answer 27
        CheckArray.add("1"); //Answer 28
        CheckArray.add("3"); //Answer 29
        CheckArray.add("4"); //Answer 30
    }
    
    //To keep AnswerArray so that it can be accessed and used from main method
    public ArrayList<String> getList() {
        return CheckArray;
    }
}