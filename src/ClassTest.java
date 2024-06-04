import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many odd number you want to use : ");
        int totalOdd = scanner.nextInt();
        int i = 0;
        int count = 0;

        do{
            if(i%2==1){
                System.out.println(i);

            }
            i++ ;
        } while (i<5);
    }




}
