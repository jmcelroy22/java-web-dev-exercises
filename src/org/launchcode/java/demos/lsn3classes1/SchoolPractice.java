package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("Mike", 34);
        //Student.getName());
      //  newStudent.getName("Bubba");
        System.out.println(newStudent.getName());

        Course english = new Course("English", "Mr. Freeze");

        english.addStudent(newStudent);
       // ArrayList<Student> roster = english.getClassRoster();
      //  for(Student student: roster){
           // System.out.println(student.getName());
        }
    }
//}
