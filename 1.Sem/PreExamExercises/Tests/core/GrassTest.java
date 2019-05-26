package core;

import org.junit.Assert;
import org.junit.Test;
import ui.MockUI;

public class GrassTest {
    private final double DOUBLE_DIFF = 0.0;

    @Test
    public void testDaysToCut() {
        Grass grass = new Grass(null);
        double curr = 0.2;
        double max = 1.0;
        double days = grass.daysToCut(curr,max);

        double exp = (max - curr) / 0.8;

        Assert.assertEquals(exp,days,DOUBLE_DIFF);
    }

    @Test
    public void testDaysToCut_withHighMax() {
        Grass grass = new Grass(null);
        double curr = 0.2;
        double max = 8.0;
        double days = grass.daysToCut(curr,max);

        double exp = (max - curr) / 0.8;

        Assert.assertEquals(exp,days,DOUBLE_DIFF);
    }

    @Test
    public void testRun_givenValidUserInput() {
        MockUI mock = new MockUI(new String[] {"0.2", "1.0"});
        Grass grass = new Grass(mock);

        grass.run();

        String output = mock.getOutputs().get(0);
        // Test if there are more numbers than 2 after the , in the output text.
        boolean onlyTwoDecimals = !output.contains(",") ||
                ((output.lastIndexOf(",") + 3) == output.length());

        Assert.assertEquals(1,mock.getOutputsSize());
        Assert.assertTrue(onlyTwoDecimals);
    }

    @Test(expected = NumberFormatException.class)
    public void testRun_withInvalidUserInput() {
        MockUI mock = new MockUI(new String[] {"abe", "tiger"});
        Grass grass = new Grass(mock);

        grass.run();
    }
}
