package Exam;

import java.util.Scanner;

public class Quest3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting point: ");
        int startP = scanner.nextInt();

        System.out.println("Enter the ending point :");
        int endP = scanner.nextInt();

        int count = 0;

        for (int i = startP; i <= endP; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                count++;

                }

            if (count == 5) {
                break;
            }
        }
    }

}
