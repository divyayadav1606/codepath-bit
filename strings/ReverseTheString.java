/**
 * Given an input string, reverse the string word by word.
 * Given s = "the sky is blue", return "blue is sky the".
 *
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * If there are multiple spaces between words, reduce them to a single space in the reversed string.
 */
public class Solution {
    public String reverseWords(String a) {
        char[] c = a.toCharArray();
        StringBuffer result = new StringBuffer();
        int i = c.length - 1;

        while( i >= 0) {
            StringBuffer temp = new StringBuffer();

            while (i >= 0 && c[i] != ' ') {
                temp.append(c[i]);
                i--;
            }

            result.append(temp.reverse());
            if (temp.length() > 0 && i >= 0) {
                result.append(" ");
            }
            i--;
        }

        return result.toString();
    }
}