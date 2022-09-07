package org.launchcode.java.studios.FunWithQuizes;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Questions {

    private ArrayList<String> possilbeAnswers;

    private int correctAnswers;


    public MultipleChoice(int pointValue, String text, int correctAnswers, ArrayList<String> possibleAnswers) {
        super(pointValue, text); //bringing in the constructor for the questions abstract class
        this.correctAnswers = correctAnswers;
        this.possilbeAnswers = possibleAnswers;
        setPointValue(1);

    }

    @Override
    public void displayAnswers() {
        //do a for:each loop
        for (int i = 0; i < possilbeAnswers.size(); i++) {
            System.out.println(possilbeAnswers.get(i));
        }
    }

    public boolean isCorrectAnswer(int possibleAnswer) {
        if (possibleAnswer == correctAnswers) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What is your answer? Ender the number with the correct answer");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isCorrectAnswer(result)) {
            return 1;
        } else {
            return 0;
        }
    }
}





