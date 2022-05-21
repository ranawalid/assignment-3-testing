import java.util.*;

public class CoffeeMachine extends coffee {

    public int order(int type, int amount) {

        Boolean test = check(type, amount);
        if (test == true) {
            float cash = price - (float) type;
            int coffeeAmount = size - amount;
            System.out.println("please wait, The remaining amount of money is " + cash);
            System.out.println("You can fill your cup up to  " + coffeeAmount );

            return 1;
        } else {
            System.out.println(" cash isn't sufficient or amount of coffee is bigger than the normal range");
            return 0;
        }
    }
}
