package core;

import org.junit.Test;
import org.junit.Assert;
import ui.MockUI;

public class SortingTest {
    private String[] input = new String[] {"abekat", "musefælde", "ananas","slut","solskin"};
    private String[] exp = new String[] {"solskin", "slut", "musefælde","ananas","abekat"};
    @Test
    public void testSort() {
        MockUI mock = new MockUI(input);
        Sorting sorting = new Sorting(mock);

        sorting.sort();

        Assert.assertEquals(5, mock.getOutputsSize());
    }


    @Test
    public void testSort_withSortedOutput() {
        MockUI mock = new MockUI(input);
        Sorting sorting = new Sorting(mock);

        sorting.sort();

        Assert.assertEquals(5, mock.getOutputsSize());
        for(int i = 0; i < mock.getOutputsSize(); i++) {
            Assert.assertEquals(exp[i], mock.getOutputs().get(i));
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testsort_withEmptyInputList() {
        MockUI mock = new MockUI(new String[] {});
        Sorting sorting = new Sorting(mock);

        sorting.sort();
    }
}
