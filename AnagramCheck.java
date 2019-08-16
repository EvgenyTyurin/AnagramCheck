import java.util.Arrays;
import java.util.Scanner;

/**
 * Check two string are anagrams (peek <-> keep), yes you can
 */

public class AnagramCheck {

    public static void main(String[] args) {
        // User input
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Input string one");
        String str1 = scanInput.next();
        System.out.println("Input string two");
        String str2 = scanInput.next();
        // Both strings to sorted array of chars
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        // Compare arrays for result
        boolean checkResult = Arrays.equals(charArray1, charArray2);
        System.out.println("String one is anagram of string two? " + checkResult);
    }
}
