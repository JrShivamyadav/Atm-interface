import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {
    ATM atm = new ATM();
    Map<Double, String> MiniStatement = new HashMap<>();


    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount%500 ==0){
        if (withdrawAmount <= atm.getBalance()) {
            MiniStatement.put(withdrawAmount, "Amount Withdrawn ");
            System.out.println("collect the Cash ." + withdrawAmount);
            atm.setWithdrawAmount(atm.getWithdrawAmount());
            viewBalance();
        } else {
            System.out.println(" Insufficient Balance..");
        }
    }
else {
            System.out.println(" please enter the amount in multiple of 500.");
        }
}
    @Override
    public void depositAmount(double depositAmount) {
        MiniStatement.put(depositAmount,"Amount Withdrawn ");
        System.out.println(depositAmount + "Deposited Successfully!!");
atm.setBalance(atm.getBalance()+ depositAmount);
viewBalance();
    }

    @Override
    public void viewMiniStatement() {
for (Map.Entry<Double,String> m:MiniStatement.entrySet()){
    System.out.println(m.getKey()+ ""+m.getKey());
}
    }
}
