package org.launchcode.java.studios.FunWithQuizes;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Questions {

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;

    public CheckBox(int pointValue, String text, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(pointValue, text);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
        setPointValue(this.correctAnswers.size());

    }

    @Override
    public void displayAnswers() {
        for (int i = 0; i <possibleAnswers.size(); i++){
            System.out.println(possibleAnswers.get(i));
        }
    }

    public int checkAnswers(ArrayList<Integer> check) {
        int answersCorrect = 0;
        for (int i = 0; i < check.size(); i++) {

            if (correctAnswers.contains(check.get(i))) {
                answersCorrect++;
            }

        }
        return answersCorrect;
    }
    @Override
    public int getAnswers(){
        ArrayList<Integer> usersAnswers = new ArrayList<>();
        System.out.println("For this question, there are multiple correct answers.");
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while (goingToContinue.indexOf('y') >= 0 && usersAnswers.size() <= possibleAnswers.size()){
            System.out.println("What will your answer be?");
        }
    }
}
