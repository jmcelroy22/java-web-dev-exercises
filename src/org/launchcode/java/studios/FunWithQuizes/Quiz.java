package org.launchcode.java.studios.FunWithQuizes;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Questions> questions;
    private int score;
    private int total;

    public Quiz(ArrayList<Questions> questions) {
        this.questions = questions;
        this.score = 0;
        this.total = 0;
        for (int i =0; i < questions.size(); i ++) {
            this.total = this.total = questions.get(i).getPointValue();
        }
    }

    public void addQuestion(Questions newQuestions) {
        this.questions.add(newQuestions);
        this.total = this.total + newQuestions.getPointValue();
    }

    public void runQuiz() {
        for (int i = 0; i < questions.size(); i ++){
            questions.get(i).displayQuestion();
            questions.get(i).displayAnswers();
            int pts = questions.get(i).getAnswers();
            updateScore(pts);
        }

    }

    public void updateScore (int x) {
        this.score = this.score + x;


    }
    public void gradeQuiz (){
        System.out.println("You finished the quiz! Your score is: " + score);
    }
}
