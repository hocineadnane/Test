package Exam;

import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (between 50 and 100): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (between 50 and 100): ");
        int number2 = scanner.nextInt();

        if (number1>50 && number2>50 && number1<100 && number2<100) {

            if (number1 > number2) {
                System.out.println("The first number is bigger.");
            } else if (number2 > number1) {
                System.out.println("The second number is bigger.");
            }

        } else {
                System.out.println("Invalid Entry");

            }
        }

    }

