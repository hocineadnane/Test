public class Loop {

    public static void main(String[] args) {

//        int sum=0;
//        for (int i =1; i <= 6; i++) {
//            if (i%2==0) {
//               // System.out.println(i);
//                sum = sum+i;
//
//            }
//        }
//        System.out.println(sum);
//        sum=0;
//
//        for(int i=1; i<=100; i++){
//            sum = sum +i;
//            if(sum>3000){
//                break;
//            }
//        }
//        System.out.println(sum);



        for (int i=0; i<=5; i++){
            System.out.println("Hello " +i);
            if(i==3){
                continue;

            }
            System.out.println("End " +i);
            System.out.println("End " +i);
        }
    }
}