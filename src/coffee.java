
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class coffee {
    public float price = 75F;
    int size =255;

    public Boolean check (int amount,int coffeeAmount){
        if (amount<= price && coffeeAmount>0 &&size>coffeeAmount)

            return  true;
        else
            return false;
    }

    }

