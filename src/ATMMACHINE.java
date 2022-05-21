import java.util.*;
public class ATMMACHINE {
      public int withdraw(int amount){
        ATM trial = new ATM();
        String ok = trial.check(amount);
        if(ok=="Accept"){
            int Mbalance = trial.balance_money-amount;
            System.out.println("amount is"+amount);
              System.out.println("now your balance is"+Mbalance);
             return 1;

        }
         else
               System.out.println("sorry, your balance isn't enough");

                return 0;
    }




}


