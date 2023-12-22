import java.util.List;
import java.util.Scanner;

public class Question {
    private String question;
    private Scanner input = new Scanner(System.in);
    private List<String> possibleAnswers;
    private boolean isCorrect;
    private List<String> correctAnswers;

    public Question(String aQuestion, List aPossibleAnswers, boolean anIsCorrect, List aCorrectAnswers) {
        question = aQuestion;
        possibleAnswers = aPossibleAnswers;
        isCorrect = anIsCorrect;
        correctAnswers = aCorrectAnswers;
    }
    public void askQuestion() {
        System.out.println(question);
    }

    public void printAnswers(){
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(possibleAnswers.get(i));
        }
    }

}
