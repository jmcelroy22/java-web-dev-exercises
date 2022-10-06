package org.launchcode.java.studios.FunWithQuizes;

public abstract class Questions {
    //question abstract class. we will never instantiate only extended to our other questions
    private int pointValue;
    //pointValue and text for the question to go with every question type.
    private String text;

    //a constructor for the two fields that needs to be initialized for every question
    public Questions (int pointValue, String text){
        this.pointValue = pointValue;
        this.text = text;

        //common fields and methods to implement them
    }

    public void displayQuestion(){

        System.out.println(text);
    }

    public void setPointValue(int x) {

        this.pointValue = x;
    }

    public int getPointValue(){
    return this.pointValue;
    }
    public abstract void displayAnswers ();
    //implement this method on any class that extends the Questions class. To display possible answers. This is
    //an abstract class we build from.

    public abstract int getAnswers();
    //here bc question class will be extended,

}
