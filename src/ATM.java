import java.util.*;
public class ATM {
    public int balance_money=50000;
     public String check (int amount){
        if (balance_money>amount)
            return "Accept";
            else
                   return "reject";


    }
}
