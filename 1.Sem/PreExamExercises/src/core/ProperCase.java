package core;

public class ProperCase {
    /*
    6) OPGAVE: Proper case
    Skriv en metode, der tager imod en sætning af ord med blanktegn imellem. Sætningen ændres efter følgende regler:
    •	Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
    •	Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
    •	Ord på max. 3 bogstaver skal skrives med småt.

    Metoden skal returnere den ændrede sætning.

    •	Inddrag fejlhåndtering (Hvordan vil du f.eks. håndtere en null-string som input?)

     */
    public static String makeProperCase(String input) throws IllegalArgumentException {
        if(input == null) {
            throw new IllegalArgumentException("Given input må ikke være null");
        }
        else {
            String[] splits = input.split(" ");
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < splits.length; i++) {

                // RULE 1: If all letters is upper-case
                if(splits[i].matches("[A-Z]*")) {
                    builder.append(splits[i]);
                }

                // RULE 2: If the word is more than 4 letters long, make the first become upper-case
                else if(splits[i].matches("[a-zA-Z]{4,}")) {
                    String temp = splits[i];
                    String ch = (temp.charAt(0)+"").toUpperCase();
                    temp = temp.replaceFirst(temp.charAt(0)+"", ch);
                    builder.append(temp);
                }

                // RULE 3:If the word is at max 3 letters long, make it lower-case.
                else if(splits[i].matches(("[a-zA-Z]{1,3}"))){
                    builder.append(splits[i].toLowerCase());
                }

                if(i != splits.length-1) {
                    builder.append(" ");
                }
            }
            return builder.toString();
        }
    }
}
