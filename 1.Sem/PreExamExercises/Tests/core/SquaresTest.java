package core;

import org.junit.Assert;
import org.junit.Test;
import ui.MockUI;

import java.util.List;

public class SquaresTest {

    @Test
    public void testSquaresDisplay() {
        int number = 6;
        String mark = "*";
        MockUI mock = new MockUI(new String[] {});
        Squares squares = new Squares(mock);
        squares.display(number, mark);
        int rows = mock.getOutputsSize();
        int columns = mock.getOutputs().get(0).split(" ").length;

        boolean onlyContainsOneMark = checkForMarks(number,mark,mock.getOutputs());

        Assert.assertEquals(number, rows);
        Assert.assertEquals(number, columns);
        Assert.assertTrue(onlyContainsOneMark);
    }

    @Test
    public void testSquaresDisplay_withDifferentMark() {
        int number = 6;
        String mark = "2";
        MockUI mock = new MockUI(new String[] {});
        Squares squares = new Squares(mock);
        squares.display(number, mark);
        int rows = mock.getOutputsSize();
        int columns = mock.getOutputs().get(0).split(" ").length;

        boolean onlyContainsOneMark = checkForMarks(number,mark,mock.getOutputs());

        Assert.assertEquals(number, rows);
        Assert.assertEquals(number, columns);
        Assert.assertTrue(onlyContainsOneMark);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquaresDisplay_withNegativeNumber() {
        int number = -6;
        String mark = "2";
        MockUI mock = new MockUI(new String[] {});
        Squares squares = new Squares(mock);
        squares.display(number, mark);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquaresDisplay_withZeroNumber() {
        int number = 0;
        String mark = "2";
        MockUI mock = new MockUI(new String[] {});
        Squares squares = new Squares(mock);
        squares.display(number, mark);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquaresDisplay_withNullPointerMark() {
        int number = 6;
        String mark = null;
        MockUI mock = new MockUI(new String[] {});
        Squares squares = new Squares(mock);
        squares.display(number, mark);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquaresDisplay_withWhitespaceMark() {
        int number = 6;
        String mark = " ";
        MockUI mock = new MockUI(new String[] {});
        Squares squares = new Squares(mock);
        squares.display(number, mark);
    }








    // Helper method for checking the output.
    private boolean checkForMarks(int number, String mark, List<String> outputs) {
        boolean onlyContainsOneMark = true;
        for(int i = 0; i < number; i++) {
            String[] splits = outputs.get(i).split(" ");
            for (int j = 0; j < number; j++) {
                if(!splits[j].equals(mark))
                    onlyContainsOneMark = false;
            }
        }
        return onlyContainsOneMark;
    }
}
