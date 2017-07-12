/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 */
public class Solution {
    public int isPalindrome(String a) {

        a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] c = a.toCharArray();
        int isPalindrome = 1;

        for (int i = 0; i < c.length/2; i++) {
            if (c[i] != c[c.length - i -1]) {
                isPalindrome = 0;
                break;
            }
        }

        return isPalindrome;
    }
}