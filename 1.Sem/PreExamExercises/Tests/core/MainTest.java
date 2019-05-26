package core;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class MainTest {

    @Test
    public void testInsertInArrayList_insertion() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hej");
        list.add("med");

        boolean result = Main.insertInArrayList(list, "dig");

        Assert.assertTrue(result);
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testInsertInArrayList_withInvalidArrayList() {
        ArrayList<String> list = null;

        boolean result = Main.insertInArrayList(list,"hej");

        Assert.assertFalse(result);
    }

    @Test
    public void testInsertInArrayList_duplicateInsertion() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hej");
        list.add("med");

        boolean result = Main.insertInArrayList(list, "Hej");

        Assert.assertFalse(result);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testInsertInArrayList_nullValuedString() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hej");
        list.add("med");

        boolean result = Main.insertInArrayList(list, null);

        Assert.assertFalse(result);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testInsertInArrayList_listIsSorted() {
        ArrayList<String> list = new ArrayList<>();
        list.add("b");
        list.add("c");

        boolean result = Main.insertInArrayList(list, "a");

        Assert.assertTrue(result);
        Assert.assertEquals("a",list.get(0));
        Assert.assertEquals("b",list.get(1));
        Assert.assertEquals("c",list.get(2));
    }

    @Test
    public void testInsertInArrayList_listIsSortedWithInvalidString() {
        ArrayList<String> list = new ArrayList<>();
        list.add("b");
        list.add("c");
        list.add("a");
        boolean result = Main.insertInArrayList(list, null);

        Assert.assertFalse(result);
        Assert.assertEquals("a",list.get(0));
        Assert.assertEquals("b",list.get(1));
        Assert.assertEquals("c",list.get(2));
    }

}
