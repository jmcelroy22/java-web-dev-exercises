package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Double, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        String classRoster = "";


        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                // classRoster.put(newID, newStudent);

                input.nextLine();

            }

        } while (!newStudent.equals(""));
        input.close();

        System.out.println("\nClass roster:");


//        for (Map.Entry<Integer, String> student : classRoster.entryset()) {
//            System.out.println(student.getValue() + "'s ID: " + student.getKey());
//        }
//        System.out.println("Number of students in roster: " + classRoster.size());
//    }
//}


    }
}