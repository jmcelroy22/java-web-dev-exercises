package org.launchcode.java.studios.FunWithQuizes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(new ArrayList<>());
        ArrayList<String> possAns1 = new ArrayList<>(Arrays.osList("Garfield", "Salem", "Cheshire" "Sparky");
        ArrayList<Integer> correctAns1 = new ArrayList<>(Arrays.asList(2,3));
        CheckBox newQuestion1 = new Checkbox(2, "Who is the best cat in the world?," );
        myQuiz.addQuestion(newQuestion1);
        ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("Doc", "Tillie", "Gizmo", "Benji", "Nale");
        MultipleChoice newQuestion2 = new MultipleChoice(1, "Who won the Halloween Cosutume, );
        TrueOrFalse newQuestion3 = new TrueOrFalse(1, "Are all dogs the best?", "True or False?");
        myQuiz.addQuestion(newQuestion3);

        myQuiz.runQuiz();

        myQuiz.gradeQuiz();

    }

}
