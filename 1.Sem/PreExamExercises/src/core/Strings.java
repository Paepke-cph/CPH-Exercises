package core;

public class Strings {
    public static String concat(String str1, String str2, char ch1, char ch2) throws IllegalArgumentException {
        if(str1 == null || str2 == null) {
            throw new IllegalArgumentException("Stengene må ikke være null");
        }
        String temp = str1+str2;
        return temp.replaceAll(ch1+"",ch2+"");
    }
}
