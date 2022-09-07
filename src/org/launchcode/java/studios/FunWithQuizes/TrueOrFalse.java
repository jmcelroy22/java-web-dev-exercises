package org.launchcode.java.studios.FunWithQuizes;

import java.util.Scanner;

public class TrueOrFalse extends Questions {

    private boolean correctAnswers;


        //constructor
    public TrueOrFalse(int pointValue, String text, boolean correctAnswers) {
        super(pointValue, text);
        setPointValue(1);
        this.correctAnswers = correctAnswers;

    }

    public boolean isCorrectAnswers (boolean possibleAnswer){
        if(possibleAnswer == correctAnswers){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void displayAnswers() {
        System.out.println("True or False");

    @Override

    public int getAnswers () {
        Scanner answer = new Scanner(System.in);
        System.out.println("What is your answer? Type 't' for True and 'f' for False.");
        String userAnswer = answer.nextLine();
        if(userAnswer.indexOf('t') >= 0) {
            if(isCorrectAnswers(true)){
                return 1;
            } else {
                return false;
            }
        }
        else {
            if (isCorrectAnswers(false)) {
                return 1;
            } else {
                return 0;
            }
        }
        }

    }
}