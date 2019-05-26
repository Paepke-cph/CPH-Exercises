package core;

import org.junit.Test;
import org.junit.Assert;
import ui.MockUI;

public class MenuTest {

    @Test
    public void testDisplay_withValidInpu() {
        MockUI mock = new MockUI(new String[]{"1"});
        Menu menu = new Menu(mock);

        int result = menu.display();

        Assert.assertEquals(3, mock.getOutputsSize());
        Assert.assertEquals(1, result);
    }

    @Test(expected = NumberFormatException.class)
    public void testDisplay_withInvalidInput() {
        MockUI mock = new MockUI(new String[]{"x"});
        Menu menu = new Menu(mock);
        menu.display();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDisplay_withToLowInput() {
        MockUI mock = new MockUI(new String[]{"-1"});
        Menu menu = new Menu(mock);
        menu.display();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDisplay_withToHighInput() {
        MockUI mock = new MockUI(new String[]{"100"});
        Menu menu = new Menu(mock);
        menu.display();
    }
}
