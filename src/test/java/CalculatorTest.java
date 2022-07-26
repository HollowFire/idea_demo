import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void shouldReturn2When1Plus1() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResults = calculator.compute(1, 1, "Add");
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResults);
    }


    @Test
    public void shouldReturn0When1Sub1() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResults = calculator.compute(1, 1, "Sub");
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResults);
    }

    @Test
    public void shouldReturn4When2Multi2() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResults = calculator.compute(2, 2, "Multi");
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, actualResults);
    }


}