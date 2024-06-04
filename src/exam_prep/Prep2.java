package exam_prep;

import java.util.Arrays;

public class Prep2 {

    public static void main(String[] args) {

       int[] nums = new int[10];
        int[] numbers = {2, 9, 8, 6, 25, 7, 5, 3, 9};

//        for (int i=numbers[0]; i< numbers.length; i++){
//            System.out.println(numbers[i]);
//        }




        int sum = 0;
        for (int i=0; i< numbers.length; i++){
            sum= sum + numbers[i];

            if (sum >50){
                System.out.println("index: " +i);
                System.out.println("sum = " +sum);
                break;
            }
        }

    }
}
