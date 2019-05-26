package core;

import org.junit.Test;
import org.junit.Assert;
import ui.MockUI;

public class CalculatorTest {

    @Test
    public void testCalculate_outputSize() {
        int val1 = 5;
        int val2 = 7;
        MockUI mock = new MockUI(null);
        Calculator calculator = new Calculator(mock);

        calculator.calculate(val1,val2);

        Assert.assertEquals(4, mock.getOutputsSize());
    }

    @Test
    public void testCalculate_calculations() {
        int val1 = 5;
        int val2 = 7;
        MockUI mock = new MockUI(null);
        Calculator calculator = new Calculator(mock);

        calculator.calculate(val1,val2);

        double add = Double.parseDouble(mock.getOutputs().get(0));
        double sub = Double.parseDouble(mock.getOutputs().get(1));
        double div = Double.parseDouble(mock.getOutputs().get(2));
        double mul = Double.parseDouble(mock.getOutputs().get(3));

        Assert.assertEquals(val1+val2,add,0.0);
        Assert.assertEquals(val1-val2,sub,0.0);
        Assert.assertEquals(val1/val2,div,0.0);
        Assert.assertEquals(val1*val2,mul,0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculate_withInvalidFirstParam() {
        int val1 = -1;
        int val2 = 5;
        MockUI mock = new MockUI(null);
        Calculator calculator = new Calculator(mock);

        calculator.calculate(val1,val2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculate_withInvalidSecondParam() {
        int val1 = 1;
        int val2 = 55;
        MockUI mock = new MockUI(null);
        Calculator calculator = new Calculator(mock);

        calculator.calculate(val1,val2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculate_withInvalidParameters() {
        int val1 = 500;
        int val2 = -5;
        MockUI mock = new MockUI(null);
        Calculator calculator = new Calculator(mock);

        calculator.calculate(val1,val2);
    }
}
