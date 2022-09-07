package org.launchcode.java.demos.lsn4classes2;

public class School {
    public static void main (String[] args){

        Student rex = new Student("Rex");
        rex.setNumberOfCredits(67);
        rex.setGpa(3.0);
        System.out.println(rex);

        Student mike = new Student("Mike");
        System.out.println(mike);
       // System.out.println(rex.equals(mike));

        Student Jaclyn = new Student("Jaclyn");
        System.out.println(Jaclyn);
    }
}
