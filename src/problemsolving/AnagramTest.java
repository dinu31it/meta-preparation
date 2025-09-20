package problemsolving;

import java.util.Arrays;

public class AnagramTest {
    public static void main(String[] args) {
        String a = "madam", b = "da mam";
        System.out.println("It is Anagram: "+isAnagram(a.trim().replaceAll("\\s+", ""), b.trim().replace(" ", "")));
    }

    public static boolean isAnagram(String strA, String strB){
        if(strA.length() != strB.length())
            return false;

        char[] charsA = strA.toLowerCase().toCharArray();
        char[] charsB = strB.toLowerCase().toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        return Arrays.equals(charsA, charsB);
    }
}
