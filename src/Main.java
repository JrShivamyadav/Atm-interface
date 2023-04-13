import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
AtmOperationInterf op =new AtmOperationImpl();

int atmnumber=  1234;
 int atmPin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!!!");
        System.out.println("Enter Atm number: ");
        int artNumber= in.nextInt();
        System.out.println("Enter pin: ");
        int pin = in.nextInt();
        if ((artNumber==atmnumber)&&(atmPin==atmPin)) {
            while (true) {
                System.out.println("1.view Available Balance \n 2.Withdraw Amount \n 3.Deposit Amount \n 4.View mini statement \n 5.Exit ");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                if (ch == 1) {
                    op.viewBalance();
                } else if (ch == 2) {
                    System.out.println("Enter Amount to Withdraw.");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                } else if (ch == 3) {
                    System.out.println("Enter Amount to deposit : ");
                    double depositAmount = in.nextDouble(); //5000
                    op.depositAmount(depositAmount);

                } else if (ch == 4) {
                    op.viewMiniStatement();

                } else if (ch == 5) {
                    System.out.println("Collect your ATM card \n thank you !!!");
                    System.exit(0);
                }
            }
        }
        else {
            System.out.println("Incorrect ATM Number or PIN.");
       System.exit(0);
        }
    }
}