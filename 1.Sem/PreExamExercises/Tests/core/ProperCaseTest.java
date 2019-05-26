package core;

import org.junit.Test;
import org.junit.Assert;

public class ProperCaseTest {

    @Test
    public void testMakeProperCase_withOnlyUpperCase() {
        String input =  "WOW";
        String output = ProperCase.makeProperCase(input);

        Assert.assertEquals(input,output);
    }

    @Test
    public void testMakeProperCase_withWordLongerThanFourLetters() {
        String input =  "important";
        String output = ProperCase.makeProperCase(input);

        Assert.assertEquals("Important",output);
    }

    @Test
    public void testMakeProperCase_withWordLongerThanFourLettersAndWordWithOnlyUpperCase() {
        String input =  "important WOW";
        String output = ProperCase.makeProperCase(input);

        Assert.assertEquals("Important WOW",output);
    }

    @Test
    public void testMakeProperCase_withAllThreeCases() {
        String input =  "important WOW Wo Wow";
        String output = ProperCase.makeProperCase(input);

        Assert.assertEquals("Important WOW wo wow",output);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMakeProperCase_withInvalidInput() {
        String input =  null;
        String output = ProperCase.makeProperCase(input);
    }

}
