import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class CoffeeMachineTest {
    @Test
    public void test1(){
    CoffeeMachine c1=new CoffeeMachine();
    assertEquals(1,c1.order(5,100));
}

    @Test
    public void test2(){
        CoffeeMachine c2=new CoffeeMachine();
        assertEquals(0,c2.order(100,300));
    }

    @Test
    public void test3(){
        CoffeeMachine c3=new CoffeeMachine();
        assertEquals(1,c3.order(5,10));
    }

    @Test
    public void test4(){
        CoffeeMachine c4=new CoffeeMachine();
        assertEquals(0,c4.order(200,300));
    }



}