package strings;

public class StringClass2 {

    public static void main(String[] args) {

       int num1= 9;

        String color1 = "White";
        String color2 = "Black";

        System.out.println(color1 + color2);
        System.out.println(color1+num1);

        String num3 = "1122";
        System.out.println(num3+num1);

        String[] colors = {"White", "Blue", "Black", "Red", "Orange"};

        for(int i=0; i<colors.length;i++){
          //  System.out.println(colors[i].toUpperCase());

            //System.out.println(i);

        }


        printStringLength("hocine adnane");


    }


    public static void printStringLength(String str) {

        System.out.println("Length is "+ str.length());





    }

    public static void fidTotalChars(String str, char ch) {

        int totalCharPresent = 0;

        for(int i= 0; i<str.length(); i++){

            if(str.charAt(i) == ch){
                totalCharPresent++;;

            }
        }
        System.out.println("Total number of char "+ totalCharPresent);


    }

}


