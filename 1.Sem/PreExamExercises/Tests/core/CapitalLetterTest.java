package core;

import org.junit.Test;
import org.junit.Assert;
import ui.MockUI;

public class CapitalLetterTest {

    @Test
    public void testCountCapital_withOneWord() {
        MockUI mock = new MockUI(new String[] {"One", ""});
        CapitalLetter cap = new CapitalLetter(mock);

        cap.run();

        int result = Integer.parseInt(mock.getOutputs().get(0).split(" ")[0]);
        Assert.assertEquals(1,mock.getOutputsSize());
        Assert.assertEquals(1, result);

    }

    @Test
    public void testCountCapital_withThreeWord() {
        MockUI mock = new MockUI(new String[] {"One","two","Three", ""});
        CapitalLetter cap = new CapitalLetter(mock);

        cap.run();

        int result = Integer.parseInt(mock.getOutputs().get(0).split(" ")[0]);
        Assert.assertEquals(1,mock.getOutputsSize());
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCountCapital_withAllLowerCase() {
        MockUI mock = new MockUI(new String[] {"one","two","three", ""});
        CapitalLetter cap = new CapitalLetter(mock);

        cap.run();

        int result = Integer.parseInt(mock.getOutputs().get(0).split(" ")[0]);
        Assert.assertEquals(1,mock.getOutputsSize());
        Assert.assertEquals(0, result);
    }

}
