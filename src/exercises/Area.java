package exercises;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        String length = input.nextLine();

        System.out.println("What is the area of the rectangle?");
        String area = input.nextLine();

        System.out.println("What is the width of the rectangle?");
        String width = input.nextLine();

        System.out.println("The area of the rectangle has the area of " + area);
    }
}
