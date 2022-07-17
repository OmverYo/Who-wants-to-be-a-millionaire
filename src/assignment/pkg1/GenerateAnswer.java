package assignment.pkg1;

import java.util.ArrayList;

/**
 * This class stores answers
 * @author Justin Lee 17989311
 */

public class GenerateAnswer {
    //Making an array of 30 Answers
    ArrayList<String> AnswerArray = new ArrayList<String>();
    
    public GenerateAnswer() {
        AnswerArray.add("1. 18th July, 1969  2. 19th July, 1969  3. 20th July, 1969  4. 21th July, 1969"); //Answer 1
        AnswerArray.add("1. Stone 2. Bird 3. Person 4. Fruit"); //Answer 2
        AnswerArray.add("1. Auckland  2. Okiato  3. Wellington  4. Christchurch"); //Answer 3
        AnswerArray.add("1. Vitamin A  2. Vitamin B  3. Vitamin C  4. Vitamin D"); //Answer 4
        AnswerArray.add("1. D is C's daughter.  2. D is C's son.  3. They are twins.  4. None of these"); //Answer 5
        AnswerArray.add("1. Mt. Cook  2. Mt. Everest  3. Mt. Alpes  4. Mt. Fuji"); //Answer 6
        AnswerArray.add("1. India  2. Canada  3. China  4. North Korea"); //Answer 7
        AnswerArray.add("1. Peahens have them. 2. They are already born.  3. Peahens ate them.  4. None of these"); //Answer 8
        AnswerArray.add("1. Steven Spielberg  2. Michael Bay  3. James Cameron  4. Christopher Nolan"); //Answer 9
        AnswerArray.add("1. They did not sleep.  2. By sleeping during the night.  3. Time Travelled  4. None of these"); //Answer 10
        AnswerArray.add("1. Italy  2. France  3. UK  4. Switzerland"); //Answer 11
        AnswerArray.add("1. Yes  2. No"); //Answer 12
        AnswerArray.add("1. Steel  2. Feathers  3. Their masses are the same.  4. It's impossible"); //Answer 13
        AnswerArray.add("1. 8  2. 9  3. 10  4. 0"); //Answer 14
        AnswerArray.add("1. 5  2. 20  3. 25  4. 100"); //Answer 15
        AnswerArray.add("1. 30  2. 59  3. 60"); //Answer 16
        AnswerArray.add("1. Busan  2. Incheon  3. Seoul  4. Deagu"); //Answer 17
        AnswerArray.add("1. 0.0  2. 0.5  3. 3.0  4. 4.0"); //Answer 18
        AnswerArray.add("1. 0  2. 1  3. 79  4. 80"); //Answer 19
        AnswerArray.add("1. anchor  2. fish  3. Kiwi bird  4. boat"); //Answer 20
        AnswerArray.add("1. GPU  2. SSD  3. CPU  4. Mainboard"); //Answer 21
        AnswerArray.add("1. Eclipse  2. NetBeans  3. Oracle  4. MS Visual Studio"); //Answer 22
        AnswerArray.add("1. Java Script  2. C language  3. C#  4. C++"); //Answer 23
        AnswerArray.add("1. WA  2. WG  3. WT  4. WB"); //Answer 24
        AnswerArray.add("1. A wave  2. A particle  3. Both  4. None of these"); //Answer 25
        AnswerArray.add("1. Normal force  2. Friction  3. Gravitional Potential Energy  4. Mass"); //Answer 26
        AnswerArray.add("1. Theory of special relativity  2. E = mc^2  3. General Relativity  4. All of these"); //Answer 27
        AnswerArray.add("1. maneuver  2. maenuver  3. menuevor  4. meanuevor"); //Answer 28
        AnswerArray.add("1. Preposition  2. Article  3. Conjunction  4. Abverb"); //Answer 29
        AnswerArray.add("1. 27th August  2. 28th August  3. 29th August  4. 30th August"); //Answer 30
    }
    
    //To keep AnswerArray so that it can be accessed and used from main method
    public ArrayList<String> getList() {
        return AnswerArray;
    }
}