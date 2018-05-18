import javax.swing.*;
import java.io.*;

public class QuizCard implements Serializable{

    public String question;
    public String answer;

    public QuizCard(String q, String a){
        question = q;
        answer = a;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
