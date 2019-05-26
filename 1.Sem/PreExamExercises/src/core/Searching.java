package core;

import java.util.NoSuchElementException;

public class Searching {
    public static int search(String[] input, String key) {
        int result = -1;
        for(int i = 0; i < input.length; i++) {
            if(input[i].equals(key)){
                return i;
            }
        }
        return result;
    }

    public static int searchChecked(String[] input, String key) throws NoSuchElementException {
        for(int i = 0; i < input.length; i++) {
            if(input[i].equals(key)){
                return i;
            }
        }
        throw new NoSuchElementException("Element: " + key + " was not found in the array");
    }
}
