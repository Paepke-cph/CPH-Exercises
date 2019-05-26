package core;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayInsert {
    /*
        1) OPGAVE: ArrayList

        Metoden skal gøre følgende:
        •	Indsætte strengen i arraylisten, hvis den ikke findes i listen i forvejen.
                Ellers gøres ingenting med streng og arrayliste.
        •	returnere værdien true, hvis strengen er blevet indsat i arraylisten.  Ellers false.
        •	Inddrag fejlhåndtering i din løsning, således at null  værdier undgås i arraylisten
        •	Hold listen sorteret.
         */
    public static boolean insertInArrayList(ArrayList<String> list, String input) {
        boolean result;
        // Check if the list is null
        if(list != null) {
            // Check if the string is null and if the string is in the list
            if(input != null && !list.contains(input)) {
                list.add(input);
                result = true;
            }
            else {
                result = false;
            }
            // We only want to sort the list if it is initialized, but even if we don't insert a new element
            //   we want to make sure the list is sorted.
            Collections.sort(list);
        }
        else {
            result = false;
        }
        return result;
    }
}
