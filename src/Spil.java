import java.util.Scanner;
    public class Spil {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Account Account_1 = new Account(0,3000);
            System.out.println(Account_1.getTotalBalance());
            Account_1.changeBalance(300);
            System.out.println(Account_1.getTotalBalance());
        }
    }
