package assignment.pkg1;

import java.util.Scanner;
import java.io.*;

/**
 * This is main class that runs the game.
 * @author Justin Lee 17989311
 */

public class GameApplication {
    static int GameContinue = 1;
    static Scanner scan = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static String input;
    static ScoreAndCoin sac = new ScoreAndCoin();
    static QuestionNumber qn = new QuestionNumber();
    static GenerateQuestion gq = new GenerateQuestion();
    static GenerateAnswer ga = new GenerateAnswer();
    static CheckAnswer ca = new CheckAnswer();
    
    public static void main(String[] args) {
        //Intro of the game
        try {
            FileReader fr = new FileReader("Intro.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line = null;
            while((line = inputStream.readLine()) != null) {
                System.out.println(line);
            }
            inputStream.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch (IOException e) {
            System.out.println("Error reading from file "+ e.getMessage()+".");
        }
        
        System.out.println("");
        
        //Repetition of the game depending on the user's input and status of victory
        while (GameContinue != 0) {
            System.out.println("Type 1 to continue the game or 0 to end the game");
            GameContinue = scan.nextInt();
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            
            //Scanner user input = 1 continues the game
            if (GameContinue == 1) {
                //To keep the randomly chosen number
                int keepNum = qn.getNumber();
                //Removes a coin as the games starts
                sac.removeCoin();
                System.out.println("The game has started.");
                System.out.println("Your Question number is: "+keepNum);
                //Prints out Question
                System.out.println("Q"+keepNum+": "+gq.getList().get(keepNum - 1));
                //Prints out Answer
                System.out.println("A: "+ga.getList().get(keepNum - 1));
                
                input = sc.nextLine();
                
                //Checks if the answer is correct
                if (ca.getList().get(keepNum - 1).equals(input)) {
                    System.out.println("You are correct!");
                    //Adds a score
                    sac.addScore();
                    //Checks if score is equal to 10 or more than 10
                    sac.setScore(sac.getScore());
                    
                    //Removes the question and answer
                    gq.getList().remove(keepNum);
                    ga.getList().remove(keepNum);
                    ca.getList().remove(keepNum);
                    qn.minusRange();
                
                    //Checks if the game is setted to Victory, if so Victory
                    if (sac.isVictory()) {
                        System.out.println("Congratulation! You are a miilionaire now!");
                        GameContinue = 0;
                        break;
                    }
                }
                //If the answer is wrong
                else {
                    System.out.println("You are wrong!");
                    //Checks a lose streak to make the user lose
                    sac.addLoseStreak();
                    sac.setLoseStreak(sac.getLoseStreak());
                    
                    //Removes the question and answer
                    gq.getList().remove(keepNum);
                    ga.getList().remove(keepNum);
                    ca.getList().remove(keepNum);
                    qn.minusRange();
                    
                    //Checks if the player has coin number equal to 0 or less, is so defeat
                    if (sac.getCoin() <= 0) {
                        sac.setCoin(sac.getCoin());
                        System.out.println("You lost!");
                        GameContinue = 0;
                        break;
                    }
                }
                
                System.out.println(sac.toString());
            }
            
            //Scanned user input = 0 ends the game
            else if (GameContinue == 0) {
                System.out.println("The game is now ended.");
                System.out.println("Your final score was: "+sac.getScore());
                System.out.println("Thank you for playing!");
                break;
            }
            
            //Scanned user input != 1 || 0 makes the user to input the number again.
            else if (GameContinue != 1 && GameContinue != 0) {
                System.out.println("Invalid number. Choose a 1 or 0 to proceed.");
            }
            System.out.println("");
        }
    }
}