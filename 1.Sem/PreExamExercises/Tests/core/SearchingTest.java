package core;

import org.junit.Test;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class SearchingTest {
    @Test
    public void testSeach() {
        String[] input = new String[] {};
        String key = "test";

        int index = Searching.search(input,key);
        Assert.assertEquals(-1,index);
    }

    @Test
    public void testSeach_withNoMatch() {
        String[] input = new String[] {"tt", "tt", "tes2t"};
        String key = "test";

        int index = Searching.search(input,key);
        Assert.assertEquals(-1,index);
    }

    @Test
    public void testSeach_withNonEmptyArrayAndOneMatch() {
        String[] input = new String[] {"tt", "tt", "test"};
        String key = "test";

        int index = Searching.search(input,key);
        Assert.assertEquals(2,index);
    }

    @Test
    public void testSeach_withMultipleMatches() {
        String[] input = new String[] {"test", "tt", "tt", "test"};
        String key = "test";

        int index = Searching.search(input,key);
        Assert.assertEquals(0,index);
    }

    @Test(expected = NoSuchElementException.class)
    public void testSeachChecked_WithNoMatches() {
        String[] input = new String[] {"te2)st", "tt", "tt", "tes2t"};
        String key = "test";
        int index = Searching.searchChecked(input,key);
    }
}
