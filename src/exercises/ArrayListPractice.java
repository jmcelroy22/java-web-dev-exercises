package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static int evenSum(ArrayList<Integer> args){
        int arr[] = {0, 1, 3, 5, 7, 8, 8, 10, 5, 6};
        int total = 0;
        for (int Integer : arr) {
            if(Integer % 2 ==0){
                int integer;
                total += Integer;
            }
        }
        return total;

    }
}
