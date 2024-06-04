package classes;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(224455, "Hocine");

        //account.setAccountNumber(224455);

       System.out.println(account.getAccountNumber());
       account.setBalance(50);
       account.withdrawMoney(500);
        System.out.println(account.getBalance());



    }
}
