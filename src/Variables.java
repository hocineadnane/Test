public class Variables {
    public static void main(String[] args) {


        int i = -6;
        i+= 1;

        //System.out.println(i++);
        System.out.println(i);
        System.out.println(17 % 3); // mod

        if (i % 2 == 1) {
            System.out.println(i + " is an odd number");
        } else {
            System.out.println(i + " is an even number");
        }

        if (i > 0) {
            System.out.println(i + " is a positive number");
        } else {
            System.out.println(i + " is a negative number");
        }

        int weekday = 5;

        if(weekday==1){
            System.out.println("Today is Monday!");
        }else if (weekday==2) {

            System.out.println("Today is Tuesday!");
        }else if (weekday==3) {
            System.out.println("Today is Wednesday!");

        }



    }

}