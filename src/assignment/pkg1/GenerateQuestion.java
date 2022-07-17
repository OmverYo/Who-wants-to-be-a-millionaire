package assignment.pkg1;

import java.util.ArrayList;

/**
 * This class stores Questions
 * @author Justin Lee 17989311
 */

public class GenerateQuestion {
    //Making an array of 30 Questions
    ArrayList<String> QuestionArray = new ArrayList<String>();
    
    public GenerateQuestion() {
        QuestionArray.add("What was the date of Apollo 11 landing on the moon?"); //Question 1
        QuestionArray.add("Which of the following is not New Zealand Kiwi?"); //Question 2
        QuestionArray.add("Where was the first national capital of New Zealand?"); //Question 3
        QuestionArray.add("Which Vitamin do we get from sun exposure?"); //Question 4
        QuestionArray.add("C is the father of D. But D is not the son of C. How is that possible?"); //Question 5
        QuestionArray.add("Before Mount Everest was discovered, what was the highest mountain on Earth?"); //Question 6
        QuestionArray.add("What is the world's most populous country?"); //Question 7
        QuestionArray.add("If peackocks do not lay eggs, how are baby peacocks born?"); //Question 8
        QuestionArray.add("Who was the director of the movies, \"Inception, The dark knight, Interstellar, Dunkirk. etc\"?"); //Question 9
        QuestionArray.add("How can a human go 9 days without sleep?"); //Question 10
        QuestionArray.add("In which country is Colosseum in?"); //Question 11
        QuestionArray.add("Do they celebrate Thanksgiving in the UK?"); //Question 12
        QuestionArray.add("Which is heavier: 100 pounds of steel or 100 pounds of feathers?"); //Question 13
        QuestionArray.add("You have 10 pills. You have to take 1 pill everyday, but each pill has different content and has specified dates. Since they look all the same in terms of colour and size, what is the minimum number of numbers that you have to write on the pills starting from day 1?"); //Question 14
        QuestionArray.add("5 cats can catch 5 mice in 5 minutes. In the same sense to catch 100 mice in 100 minutes, how many cats do you need?"); //Question 15
        QuestionArray.add("A bacteria cell takes 1 minute to grow into 2 cells and into 4 cells in another minute. Therefore, it takes an hour to fill the whole jar. How long would it take to funfil the jar with 2 initial cells?"); //Question 16
        QuestionArray.add("Which is the capital city of South Korea?"); //Question 17
        QuestionArray.add("Which the most probable answer for 1.0 + 1.0?"); //Question 18
        QuestionArray.add("How many birthday(s) has an 80 years old person had?"); //Question 19
        QuestionArray.add("In Maori Myth, South Island is known as the waka of Maui. What is North Island known as?"); //Question 20
        QuestionArray.add("For a computer to process faster, which part should have fast processing speed?"); //Question 21
        QuestionArray.add("Which programming software is used in Programming 2?"); //Question 22
        QuestionArray.add("Which programmnig language is used in Programming 1?"); //Question 23
        QuestionArray.add("Which building code is AUT Tower?"); //Question 24
        QuestionArray.add("Is light a wave or a particle?"); //Question 25
        QuestionArray.add("When you stand on a digital scale, which force is acting to display your mass?"); //Question 26
        QuestionArray.add("Which is related to Albert Einstein?"); //Question 27
        QuestionArray.add("Which is a correct spelling?"); //Question 28
        QuestionArray.add("What is the type of grammatical name for \"Because\"?"); //Question 29
        QuestionArray.add("When is Programming 3 Mid Exam?"); //Question 30
    }
    
    //To keep QuestionArray so that it can be accessed and used from main method
    public ArrayList<String> getList() {
        return QuestionArray;
    }
}