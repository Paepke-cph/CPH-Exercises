package core;

import org.junit.Test;
import org.junit.Assert;

public class StringsTest {

    @Test
    public void testConcat() {
        String str1 = "firststring";
        String str2 = "secondstring";
        String exp = "fir#t#tring#econd#tring";
        char ch1 = 's';
        char ch2 = '#';

        String output = Strings.concat(str1,str2,ch1,ch2);
        Assert.assertEquals(str1.length()+str2.length(), output.length());
        Assert.assertEquals(exp, output);
    }

    @Test
    public void testConcat_usingWhitespace() {
        String str1 = "first string";
        String str2 = "second string";
        String exp = "first#stringsecond#string";
        char ch1 = ' ';
        char ch2 = '#';

        String output = Strings.concat(str1,str2,ch1,ch2);
        Assert.assertEquals(str1.length()+str2.length(), output.length());
        Assert.assertEquals(exp, output);
    }

    @Test
    public void testConcat_WithEmptyStrings() {
        String str1 = "";
        String str2 = "";
        String exp = "";
        char ch1 = ' ';
        char ch2 = '#';

        String output = Strings.concat(str1,str2,ch1,ch2);
        Assert.assertEquals(str1.length()+str2.length(), output.length());
        Assert.assertEquals(exp, output);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConcat_withInvalidString() {
        String str1 = null;
        String str2 = "second string";
        String exp = "first#stringsecond#string";
        char ch1 = ' ';
        char ch2 = '#';

        String output = Strings.concat(str1,str2,ch1,ch2);
    }
}
