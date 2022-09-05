import com.example.lesson6.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
     Calculator calculator;

    @BeforeEach
     void init(){
        System.out.println("NEW CALC");
        calculator = new Calculator();
        calculator.setA(2);
        calculator.setB(4);
    }

    @Test
    public void testCalculatorSum (){
        Assertions.assertEquals(4,calculator.sum(1,3));
    }

    @Test
    public void testCalcWrongSum(){
        Assertions.assertNotEquals(4,calculator.sum(2,3));
    }

    @Test
    public void testCalcSumWithNull() {
        Assertions.assertEquals(7, calculator.sum(7, 0));
    }

    @Test
    public void testCalculatorInnerSum (){
        calculator.setA(1);
        calculator.setB(3);
        Assertions.assertEquals(4,calculator.sum(1,3));
    }

    @Test
    public void testCalculatorInnerSum2 (){
        Assertions.assertEquals(6,calculator.sum());
    }

    @AfterAll
    static void end() {
        System.out.println("END");
    }
}
