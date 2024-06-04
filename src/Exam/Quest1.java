package Exam;

public class Quest1 {
    public static void main(String[] args) {

    }

    public static void areSumEqualOrNot(int[] array1, int[] array2) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }

        if (sum1 == sum2) {

            System.out.println("the Sum of the 2 arrays are equal ");
        } else {
            System.out.println("the Sum of the 2 arrays are Not equal ");
        }

    }
}


